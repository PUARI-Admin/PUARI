package pinpon.common.infrastructure.datasource;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.common.domain.model.IPinponRepository;

/**
 * MongoDBを操作する抽象クラス。
 *
 * @author watanabe
 *
 */
@Repository
public abstract class MongoDBRepository implements IPinponRepository {

	@Autowired
	MongoDBManager manager;

	/**
	 * データベース名を取得する。
	 *
	 * @return データベース名
	 */
	public abstract String getDBName();

	/**
	 * Documentよりオブジェクト型を取得する。
	 *
	 * @param grade グレード
	 * @param document Document型のデータ
	 * @return オブジェクト型のデータ
	 */
	public abstract IPinponRecord getPinponRecord(String grade, Document document);

	/**
	 * グレード、idに対応する1レコードを取得する。
	 *
	 */
	public IPinponRecord findBy(String grade, String id) {

//		System.out.println("aaaa=" + grade + id);

		// データベースインスタンスを取得する
		MongoDatabase database = manager.getDatabase(getDBName());

		String key = "id";
		String param = id;

		// キー情報を作成
		Document query = new Document(key, param);

		// グレードに対応するコレクションを取得する
		MongoCollection<Document> collection = database.getCollection(grade);

		// キーに対応するレコードを取得する
		Document result = collection.find(query).first();

		// Document型のデータをオブジェクト型に変換
		IPinponRecord pinponRecord = getPinponRecord(grade, result);

		return pinponRecord;
	}

	/**
	 * グレードに該当する総レコード(hyoji問わず)を取得する
	 *
	 */
	public List<IPinponRecord> findAll(String grade) {

		// データベースインスタンスを取得する
		MongoDatabase database = manager.getDatabase(getDBName());

		// グレードに対応するコレクションを取得する
		MongoCollection<Document> collection = database.getCollection(grade);

		// ソートキー情報を作成("yomi_ok"カラムの降順)
		BasicDBObject sort = new BasicDBObject();
		sort.put("yomi_ok", -1);

		// コレクションの総レコードをソートして取得
		FindIterable<Document> docList = collection.find().sort(sort);
		MongoCursor<Document> cursor = docList.iterator();

		List<IPinponRecord> list = new ArrayList<IPinponRecord>();

		while (cursor.hasNext()) {

			Document document = cursor.next();
			// Document型のデータをオブジェクト型に変換
			IPinponRecord pinponRecord = getPinponRecord(grade, document);

			list.add(pinponRecord);
		}

		return list;
	}

	/**
	 * グレードに該当し、hyoji="0"かつ、正答率が基準以上のデータを除外したレコード数を取得する。
	 *
	 */
	public int count(String grade) {

		// データベースインスタンスを取得する
		MongoDatabase database = manager.getDatabase(getDBName());

		// グレードに対応するコレクションを取得する
		MongoCollection<Document> collection = database.getCollection(grade);

		// 検索キー情報を作成("hyoji"カラムが"0"のもの)
		BasicDBObject query = new BasicDBObject();
		query.put("hyoji", "0");

		// キーに対応するレコードを取得
		FindIterable<Document> list = collection.find(query);

		MongoCursor<Document> cursor = list.iterator();
		int count = 0;

		while (cursor.hasNext()) {

			Document document = cursor.next();

			int yomi_ok = 0;
			int yomi_ng = 0;

			// 初期登録辞がなぜかdoubleで登録されているようで、キャストしないとエラーになる
			if (document.get("yomi_ok") instanceof Double) {
				yomi_ok = (int) (double) document.get("yomi_ok");
			} else {
				yomi_ok = (int) document.get("yomi_ok");
			}

			if (document.get("yomi_ng") instanceof Double) {
				yomi_ng = (int) (double) document.get("yomi_ng");
			} else {
				yomi_ng = (int) document.get("yomi_ng");
			}

			// 合格に達していない場合に、カウントアップ
			if (!isOK(yomi_ok, yomi_ng)) {

				count++;
			}
		}

		return count;
	}

	/**
	 * 正解数が10回以上、かつ正解率が90%以上の場合、合格(true)、それ以外の場合、不合格(false)とする。
	 *
	 * @param ok_count OK回数
	 * @param ng_count NG回数
	 * @return 正解数が10回以上、かつ正解率が90%以上の場合、合格(true)、それ以外の場合、不合格(false)
	 */
	private boolean isOK(int ok_count, int ng_count) {

		boolean result = false;

		double total_count = ok_count + ng_count;
		int seikai_ritsu = 0;

		// 正解数が10回以上、かつ正解率が90%以上の場合、合格(true)とする
		if (total_count != 0) {

			seikai_ritsu = (int) ((ok_count / total_count) * 100);

			if (seikai_ritsu >= 90 && ok_count >= 10) {

				result = true;
			}
		}

		return result;
	}

	/**
	 * グレード、idに対応するレコードの"ok_count"、"ng_count"を更新する。
	 *
	 */
	public void update(String grade, String id, int ok_count, int ng_count) {

		// データベースインスタンスを取得する
		MongoDatabase database = manager.getDatabase(getDBName());

		// キー情報を作成
		BasicDBObject query = new BasicDBObject();
		query.put("id", id);

		// 更新内容情報を作成
		BasicDBObject update = new BasicDBObject();
		update.append("$set", new BasicDBObject().append("yomi_ok", ok_count).append("yomi_ng", ng_count));

		// グレードに対応するコレクションを取得する
		MongoCollection<Document> collection = database.getCollection(grade);

		// 更新処理実行
		collection.updateOne(query, update);
	}
}
