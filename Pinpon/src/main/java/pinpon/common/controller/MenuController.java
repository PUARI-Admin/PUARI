package pinpon.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * メニュー画面のコントローラクラス。
 *
 * @author watanabe
 *
 */
@Controller
public class MenuController {

	/**
	 * メニュー画面の表示を行う。
	 *
	 * @return HTMLファイル名
	 */
	@RequestMapping(value="/")
	public String init() {

		//HTMLファイル名
		return "menu";
	}
}
