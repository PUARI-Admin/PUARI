package pinpon.common.domain.model;

import java.util.List;

/**
 * リポジトリを操作するクラスのインターフェース。
 *
 * @author watanabe
 *
 */
public interface IPinponRepository {

	/**
	 * グレード、idに対応する1レコードを取得する。
	 *
	 * @param grade グレード
	 * @param id id(レコードのキー)
	 * @return idに対応するレコード情報
	 */
	IPinponRecord findBy(String grade, String id);

	/**
	 * グレードに該当し、hyoji="0"かつ、正答率が基準以上のデータを除外したレコード数を取得する。
	 *
	 * @param grade グレード
	 * @return グレードに該当する総レコード数
	 */
	int count(String grade);

	/**
	 * グレード、idに対応するレコードの"ok_count"、"ng_count"を更新する。
	 *
	 * @param grade グレード
	 * @param id id(レコードのキー)
	 * @param ok_count OK数
	 * @param ng_count NG数
	 */
	void update(String grade, String id, int ok_count, int ng_count);

	/**
	 * グレードに該当する総レコード(hyoji問わず)を取得する
	 *
	 * @param grade グレード
	 * @return グレードに該当する総レコード
	 */
	List<IPinponRecord> findAll(String grade);
}
