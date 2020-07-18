package pinpon.jukugo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pinpon.common.controller.CommonGradeController;


/**
 * グレード選択用コントローラクラス。
 *
 * @author watanabe
 *
 */
@Controller
public class JukugoGradeController extends CommonGradeController {

	private static final String MODE_STR = "jukugo";

	/**
	 * メニュー画面から呼ばれる(Get)。
	 * グレード選択画面を表示する。
	 *
	 */
	@RequestMapping(value="/" + MODE_STR, method=RequestMethod.GET)
	public String grade() {

		return super.grade();
	}

	/**
	 * モード用文字列を返却する。
	 *
	 */
	@Override
	protected String getModeStr() {

		return MODE_STR;
	}

}
