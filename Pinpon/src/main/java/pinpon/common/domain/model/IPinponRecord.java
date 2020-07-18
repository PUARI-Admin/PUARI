package pinpon.common.domain.model;

/**
 * 問題情報の1レコードを保持するクラスのインターフェース。
 *
 * @author watanabe
 *
 */
public interface IPinponRecord {

	/**
	 * 通算OK回数を取得する。
	 *
	 * @param toralCount
	 */
	void setTotalCount(int totalCount);
}
