package pinpon.common.controller;

import org.springframework.stereotype.Controller;


/**
 * グレード用コントラーラの抽象クラス。
 *
 * @author watanabe
 *
 */
@Controller
public abstract class CommonGradeController {

	// グレード用のポスト文字列
	private static final String POST_FIX = "_grade";

	/**
	 * モード用文字列を取得する抽象メソッド
	 *
	 * @return モード用文字列
	 */
	protected abstract String getModeStr();

	/**
	 * 次画面用の文字列(HTMLファイル名)を返却する。
	 *
	 * @return 次画面用の文字列(HTMLファイル名)
	 */
	private String getNextViewName() {

		return getModeStr() + POST_FIX;
	}

	/**
	 * サブクラスから呼ばれ、次画面用の文字列(HTMLファイル名)を返却する。
	 *
	 * @return 次画面用の文字列(HTMLファイル名)
	 */
	protected String grade() {

		return getNextViewName();
	}

}
