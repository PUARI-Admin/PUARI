package pinpon.kanji.infrastructure.datasource;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import pinpon.common.infrastructure.datasource.MongoDBRepository;
import pinpon.kanji.domain.model.KanjiRecord;

/**
 * 漢字データソースを操作するクラス。
 *
 * @author watanabe
 *
 */
@Repository
public class KanjiRepository extends MongoDBRepository {

	// 漢字用のデータベース名
	private static final String DB_NAME = "kanji_test";

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
	public KanjiRecord getPinponRecord(String grade, Document document) {

		return KanjiFactory.toObject(grade, document);
	}
}
