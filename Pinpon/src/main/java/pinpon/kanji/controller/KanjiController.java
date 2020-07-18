package pinpon.kanji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pinpon.common.controller.CommonMainController;
import pinpon.kanji.application.KanjiService;
import pinpon.kanji.domain.model.KanjiSendForm;

@Controller
public class KanjiController extends CommonMainController {

	@Autowired
	private KanjiService kanjiService;

	// 漢字モードを表す文字列
	private final String MODE_STR ="kanji";

	/**
	 * サービスインスタンスを返却する。
	 *
	 * @return サービスインスタンス
	 */
	@Override
	protected KanjiService getService() {

		return this.kanjiService;
	}

	/**
	 * 選択モードの文字列を返却する。
	 *
	 * @return 選択モードの文字列
	 */
	@Override
	protected String getModeStr() {

		return MODE_STR;
	}

	/**
	 * 学年選択画面および成績から呼ばれる(Get)。
	 * 初期表示する。
	 *
	 * @param model HTML呼び出し時のパラメータ
	 * @param grade URLの/kanji/の後に続く文字列
	 * @return HTMLファイル名
	 */
	@RequestMapping(value="/" + MODE_STR + "/{grade}", method=RequestMethod.GET)
	public String gradeGet(Model model, @PathVariable String grade) {

		// スーパークラスで実装
		return super.gradeGet(model, grade);
	}

	/**
	 * 「次へ」ボタン押下時に呼ばる(Post)。
	 * 前のレコードの情報を更新し、次のレコードを表示する。
	 *
	 * @param model HTML呼び出し時のパラメータ
	 * @param grade URLの/kanji/の後に続く文字列
	 * @param sendForm　画面のフォームより渡されるパラメータ
	 * @return HTMLファイル名
	 */
	@RequestMapping(value = "/" + MODE_STR + "/{grade}", method = RequestMethod.POST)
	public String gradePost(Model model, @PathVariable String grade, @ModelAttribute KanjiSendForm sendForm) {

		// スーパークラスで実装
		return super.gradePost(model, grade, sendForm);
	}
}
