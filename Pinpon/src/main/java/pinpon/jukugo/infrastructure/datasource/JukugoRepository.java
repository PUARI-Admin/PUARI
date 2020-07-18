package pinpon.jukugo.infrastructure.datasource;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import pinpon.common.infrastructure.datasource.MongoDBRepository;
import pinpon.jukugo.domain.model.JukugoRecord;

/**
 * 熟語データソースを操作するクラス。
 *
 * @author watanabe
 *
 */
@Repository
public class JukugoRepository extends MongoDBRepository {

	// 熟語用のデータベース名
	private static final String DB_NAME = "jukugo_db";

	/**
	 * データベース名を取得する。
	 */
	@Override
	public String getDBName() {

		return DB_NAME;
	}

	/**
	 * documnet型をオブジェクト型に変換して返却する。
	 */
	@Override
	public JukugoRecord getPinponRecord(String grade, Document document) {

		return JukugoFactory.toObject(grade, document);
	}
}
