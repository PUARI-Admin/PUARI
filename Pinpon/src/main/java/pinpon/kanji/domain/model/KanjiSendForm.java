package pinpon.kanji.domain.model;

import java.io.Serializable;

/**
 * HTMLのフォーム情報を格納するクラス。
 *
 * @author watanabe
 *
 */
public class KanjiSendForm implements Serializable {

	private String buttonId;

	private String hidden_onyomi1;
	private int hidden_ok_count;
	private int hidden_ng_count;
	private int hidden_total_count;
	private String hidden_id;

	public String getButtonId(){

		return this.buttonId;
	}

	public void setButtonId(String buttonId){

		this.buttonId = buttonId;
	}

	public String getHidden_onyomi1() {
		return hidden_onyomi1;
	}

	public void setHidden_onyomi1(String hidden_onyomi1) {
		this.hidden_onyomi1 = hidden_onyomi1;
	}

	public int getHidden_ok_count() {
		return hidden_ok_count;
	}

	public void setHidden_ok_count(int hidden_ok_count) {

		this.hidden_ok_count = hidden_ok_count;
	}

	public int getHidden_ng_count() {
		return hidden_ng_count;
	}

	public void setHidden_ng_count(int hidden_ng_count) {
		this.hidden_ng_count = hidden_ng_count;
	}

	public String getHidden_id() {
		return hidden_id;
	}

	public void setHidden_id(String hidden_id) {
		this.hidden_id = hidden_id;
	}

	public int getHidden_total_count() {
		return hidden_total_count;
	}

	public void setHidden_total_count(int hidden_total_count) {
		this.hidden_total_count = hidden_total_count;
	}

}