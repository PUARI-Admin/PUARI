package pinpon.eigo.infrastructure.datasource;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import pinpon.common.infrastructure.datasource.MongoDBRepository;
import pinpon.eigo.domain.model.EigoRecord;

/**
 * 英語データソースを操作するクラス。
 *
 * @author watanabe
 *
 */
@Repository
public class EigoRepository extends MongoDBRepository {

	// 英語用のデータベース名
	private static final String DB_NAME = "eigo_db";

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
	public EigoRecord getPinponRecord(String grade, Document document) {

		return EigoFactory.toObject(grade, document);
	}
}
