package pinpon.common.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import pinpon.common.application.IPinponService;
import pinpon.common.domain.model.IPinponRecord;
import pinpon.kanji.domain.model.KanjiSendForm;


/**
 * 問題用メイン画面のコントローラの抽象クラス。
 *
 * @author watanabe
 *
 */
@Controller
public abstract class CommonMainController {

	/**
	 * サービスインスタンスを取得する。
	 *
	 * @return サービスインスタンス
	 */
	protected abstract IPinponService getService();

	/**
	 * 選択モードの文字列を取得する。
	 *
	 * @return 選択モードの文字列
	 */
	protected abstract String getModeStr();

	/**
	 * サブクラスから呼ばれる。
	 * グレードに対応する1レコードを取得し、遷移先画面のHTMLファイル名を返却する。
	 *
	 * @param model HTML呼び出し時のパラメータ
	 * @param grade URLの/kanji/の後に続く文字列
	 * @return HTMLファイル名
	 */
	protected String gradeGet(Model model, @PathVariable String grade) {

		// gradeに対応するランダムの1レコードを取得
		IPinponRecord record = get(grade);

		// HTML呼び出し時のパラメータに設定
		model.addAttribute(getModeStr(), record);

		// HTMLファイル名
		return getModeStr();
	}

	/**
	 * サブクラスから呼ばれる。
	 * 前のレコードの情報を更新、次のレコードを取得し、遷移先画面のHTMLファイル名を返却する。
	 *
	 * @param model HTML呼び出し時のパラメータ
	 * @param grade URLの/kanji/の後に続く文字列
	 * @param sendForm　画面のフォームより渡されるパラメータ
	 * @return HTMLファイル名
	 */
	protected String gradePost(Model model, @PathVariable String grade, @ModelAttribute KanjiSendForm sendForm) {

		// Hiddenに設定された項目を取得
		String id = sendForm.getHidden_id();
		int ok_count = sendForm.getHidden_ok_count();
		int ng_count = sendForm.getHidden_ng_count();
		int count = sendForm.getHidden_total_count();

		// 前のレコードの情報の更新を行う
		// idに対応するOK、NG回数
		getService().update(grade, id, ok_count, ng_count);

		// 次のレコードを取得
		IPinponRecord record = get(grade);
		// 通算OK回数を設定
		record.setTotalCount(count);

		// HTML呼び出し時のパラメータに設定
		model.addAttribute(getModeStr(), record);

		// HTMLファイル名
		return getModeStr();
	}

	/**
	 * グレードに該当する1レコードを取得する
	 *
	 * @param grade グレード
	 * @return 漢字レコード情報
	 */
	private IPinponRecord get(String grade) {

		// グレードに該当する全レコード数を取得
		int total = getService().count(grade);

		System.out.println("count = " + total);
//		int total_minus_1 = total - 1;

		// 0〜total未満のランダムな整数を取得し、id(1から始まる)用に1加算
		Random rand = new Random();
		int num_for_id = rand.nextInt(total) + 1;

		// id用にString化
		String kanjiId = new Integer(num_for_id).toString();

		// グレード、idに該当するレコードを取得
		IPinponRecord record = getService().findBy(grade, kanjiId);

		return record;
	}
}
