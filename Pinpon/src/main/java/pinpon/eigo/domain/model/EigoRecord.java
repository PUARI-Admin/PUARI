package pinpon.eigo.domain.model;

import pinpon.common.domain.model.IPinponRecord;

/**
 * 熟語データを格納するクラス。
 *
 * @author watanabe
 *
 */
public class EigoRecord implements IPinponRecord {

	private int total_count;
	private String grade;

	private String id;
	private String eigo;
	private String yomi;
	private String imi;
	private String hyoji;
	private int yomi_ok;
	private int yomi_ng;
	private int kaki_ok;
	private int kaki_ng;

	public EigoRecord(String id, String eigo, String yomi, String imi,String hyoji, int yomi_ok, int yomi_ng, int kaki_ok, int kaki_ng) {

		this.setId(id);
		this.setEigo(eigo);
		this.setYomi(yomi);
		this.setImi(imi);
		this.setHyoji(hyoji);
		this.setYomi_ok(yomi_ok);
		this.setYomi_ng(yomi_ng);
		this.setKaki_ok(kaki_ok);
		this.setKaki_ng(kaki_ng);
	}

	@Override
	public EigoRecord clone() {

		try {

			return (EigoRecord)super.clone();
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

	public String getEigo() {
		return this.eigo.equals("") ? null : this.eigo;
	}

	public void setEigo(String eigo) {
		this.eigo = eigo;
	}

	public String getYomi() {
		return this.yomi.equals("") ? null : this.yomi;
	}

	public void setYomi(String yomi) {
		this.yomi = yomi;
	}

	public String getImi() {
		return this.imi.equals("") ? null : this.imi;
	}

	public void setImi(String imi) {
		this.imi = imi;
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
		builder.append("eigo=" + eigo + ", ");
		builder.append("yomi=" + yomi + ", ");
		builder.append("imi=" + imi + ", ");
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
				result = "１級";
				break;
			case "grade2":
				result = "２級";
				break;
			case "grade3":
				result = "３級";
				break;
			case "grade4":
				result = "４級";
				break;
			case "grade5":
				result = "５級";
				break;
		}

		return result;
	}

}
