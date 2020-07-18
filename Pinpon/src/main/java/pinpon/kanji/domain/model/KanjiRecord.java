package pinpon.kanji.domain.model;

import pinpon.common.domain.model.IPinponRecord;

/**
 * 漢字データを格納するクラス。
 *
 * @author watanabe
 *
 */
public class KanjiRecord implements IPinponRecord {

	private int total_count;
	private String grade;

	private String id;
	private String kanji;
	private String daihyo;
	private String onyomi1;
	private String onyomi2;
	private String onyomi3;
	private String onyomi4;
	private String kunyomi1;
	private String kunyomi2;
	private String kunyomi3;
	private String kunyomi4;
	private String hyoji;
	private int yomi_ok;
	private int yomi_ng;
	private int kaki_ok;
	private int kaki_ng;

	public KanjiRecord(String id, String kanji, String daihyo, String onyomi1, String onyomi2, String onyomi3, String onyomi4,
			String kunyomi1, String kunyomi2, String kunyomi3, String kunyomi4, String hyoji, int yomi_ok, int yomi_ng, int kaki_ok, int kaki_ng) {

		this.setId(id);
		this.setKanji(kanji);
		this.setDaihyo(daihyo);
		this.setOnyomi1(onyomi1);
		this.setOnyomi2(onyomi2);
		this.setOnyomi3(onyomi3);
		this.setOnyomi4(onyomi4);
		this.setKunyomi1(kunyomi1);
		this.setKunyomi2(kunyomi2);
		this.setKunyomi3(kunyomi3);
		this.setKunyomi4(kunyomi4);
		this.setHyoji(hyoji);
		this.setYomi_ok(yomi_ok);
		this.setYomi_ng(yomi_ng);
		this.setKaki_ok(kaki_ok);
		this.setKaki_ng(kaki_ng);
	}

	@Override
	public KanjiRecord clone() {

		try {

			return (KanjiRecord)super.clone();
		} catch (CloneNotSupportedException e) {

			throw new Error("clone not supported");
		}
	}

	public int getTotalCount() {
		return this.total_count;
	}

	public void setTotalCount(int total_count) {
		this.total_count = total_count;
	}

	public String getId() {
		return this.id.equals("") ? null : this.id;
	}

	public void setId(String iD) {
		id = iD;
	}

	public String getKanji() {
		return this.kanji.equals("") ? null : this.kanji;
	}

	public void setKanji(String kANJI) {
		kanji = kANJI;
	}

	public String getDaihyo() {
		return this.daihyo.equals("") ? null : this.daihyo;
	}

	public void setDaihyo(String dAIHYO) {
		daihyo = dAIHYO;
	}

	public String getOnyomi1() {
		return this.onyomi1.equals("") ? null : this.onyomi1;
	}

	public void setOnyomi1(String oNYOMI1) {
		onyomi1 = oNYOMI1;
	}

	public String getOnyomi2() {
		return this.onyomi2.equals("") ? null : this.onyomi2;
	}

	public void setOnyomi2(String oNYOMI2) {
		onyomi2 = oNYOMI2;
	}

	public String getOnyomi3() {
		return this.onyomi3.equals("") ? null : this.onyomi3;
	}

	public void setOnyomi3(String oNYOMI3) {
		onyomi3 = oNYOMI3;
	}

	public String getOnyomi4() {
		return this.onyomi4.equals("") ? null : this.onyomi4;
	}

	public void setOnyomi4(String oNYOMI4) {
		onyomi4 = oNYOMI4;
	}

	public String getKunyomi1() {
		return this.kunyomi1.equals("") ? null : this.kunyomi1;
	}

	public void setKunyomi1(String kUNYOMI1) {
		kunyomi1 = kUNYOMI1;
	}

	public String getKunyomi2() {
		return this.kunyomi2.equals("") ? null : this.kunyomi2;
	}

	public void setKunyomi2(String kUNYOMI2) {
		kunyomi2 = kUNYOMI2;
	}

	public String getKunyomi3() {

		return this.kunyomi3.equals("") ? null : this.kunyomi3;
	}

	public void setKunyomi3(String kUNYOMI3) {
		kunyomi3 = kUNYOMI3;
	}

	public String getKunyomi4() {
		return this.kunyomi4.equals("") ? null : this.kunyomi4;
	}

	public void setKunyomi4(String kUNYOMI4) {
		kunyomi4 = kUNYOMI4;
	}

	public String getHyoji() {

		return this.hyoji.equals("") ? null : this.hyoji;
	}

	public void setHyoji(String hYOJI) {
		hyoji = hYOJI;
	}

	public int getYomi_ok() {
		return yomi_ok;
	}

	public void setYomi_ok(int yOMI_OK) {
		yomi_ok = yOMI_OK;
	}

	public int getYomi_ng() {
		return yomi_ng;
	}

	public void setYomi_ng(int yOMI_NG) {
		yomi_ng = yOMI_NG;
	}

	public int getKaki_ok() {
		return kaki_ok;
	}

	public void setKaki_ok(int kAKI_OK) {
		kaki_ok = kAKI_OK;
	}

	public int getKaki_ng() {
		return kaki_ng;
	}

	public void setKaki_ng(int kAKI_NG) {
		kaki_ng = kAKI_NG;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("id=" + id + ", ");
		builder.append("kanji=" + kanji + ", ");
		builder.append("daihyo=" + daihyo + ", ");
		builder.append("onyomi1=" + onyomi1 + ", ");
		builder.append("onyomi2=" + onyomi2 + ", ");
		builder.append("onyomi3=" + onyomi3 + ", ");
		builder.append("onyomi4=" + onyomi4 + ", ");
		builder.append("kunyomi1=" + kunyomi1 + ", ");
		builder.append("kunyomi2=" + kunyomi2 + ", ");
		builder.append("kunyomi3=" + kunyomi3 + ", ");
		builder.append("kunyomi4=" + kunyomi4 + ", ");
		builder.append("hyoji=" + hyoji + ", ");
		builder.append("yomi_ok=" + yomi_ok + ", ");
		builder.append("yomi_ng=" + yomi_ng + ", ");
		builder.append("kaki_ok=" + kaki_ok + ", ");
		builder.append("kaki_ng=" + kaki_ng + " ");

		return builder.toString();

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getYomi_seikai() {

		double total = this.yomi_ng + this.yomi_ok;
		int seikai_ritsu = 0;

		if (total != 0) {
			seikai_ritsu = (int)((yomi_ok / total) * 100);
		}

		return seikai_ritsu;
	}

	public int getKaki_seikai() {

		double total = this.kaki_ng + this.kaki_ok;
		int seikai_ritsu = 0;

		if (total != 0) {
			seikai_ritsu = (int)((kaki_ok / total) * 100);
		}

		return seikai_ritsu;
	}

	public String getGrade_Jap() {

		String result = null;


		switch (this.grade) {

			case "grade1":
				result = "１年生";
				break;
			case "grade2":
				result = "２年生";
				break;
			case "grade3":
				result = "３年生";
				break;
			case "grade4":
				result = "４年生";
				break;
			case "grade5":
				result = "５年生";
				break;
			case "grade6":
				result = "６年生";
				break;
		}

		return result;
	}

}
