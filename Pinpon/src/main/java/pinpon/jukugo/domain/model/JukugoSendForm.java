package pinpon.jukugo.domain.model;

import java.io.Serializable;

public class JukugoSendForm implements Serializable {

	private String buttonId;

	private String hidden_onyomi1;
	private int hidden_ok_count;
	private int hidden_ng_count;
	private int hidden_count;
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

		System.out.println("hidden_ok_count =" + hidden_ok_count);
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

	public int getHidden_count() {
		return hidden_count;
	}

	public void setHidden_count(int hidden_count) {
		this.hidden_count = hidden_count;
	}

}