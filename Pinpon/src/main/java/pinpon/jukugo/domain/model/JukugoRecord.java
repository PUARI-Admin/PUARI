package pinpon.jukugo.domain.model;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.kanji.domain.model.KanjiRecord;

/**
 * 熟語データを格納するクラス。
 *
 * @author watanabe
 *
 */
public class JukugoRecord implements IPinponRecord {

	private int total_count;
	private String grade;

	private String id;
	private String jukugo;
	private String yomi;
	private String hyoji;
	private int yomi_ok;
	private int yomi_ng;
	private int kaki_ok;
	private int kaki_ng;

	public JukugoRecord(String id, String jukugo, String yomi, String hyoji, int yomi_ok, int yomi_ng, int kaki_ok, int kaki_ng) {

		this.setId(id);
		this.setJukugo(jukugo);
		this.setYomi(yomi);
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

	public String getJukugo() {
		return this.jukugo.equals("") ? null : this.jukugo;
	}

	public void setJukugo(String jukugo) {
		this.jukugo = jukugo;
	}

	public String getYomi() {
		return this.yomi.equals("") ? null : this.yomi;
	}

	public void setYomi(String yomi) {
		this.yomi = yomi;
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
		builder.append("jukugo=" + jukugo + ", ");
		builder.append("yomi=" + yomi + ", ");
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
