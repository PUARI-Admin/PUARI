package pinpon.eigo.infrastructure.datasource;

import org.bson.Document;

import pinpon.eigo.domain.model.EigoRecord;

/**
 * Document型のデータを英語オブジェクトに変換するクラス。
 *
 * @author watanabe
 *
 */
public class EigoFactory {

	/**
	 * Document型のデータを漢字オブジェクトに変換する。
	 *
	 * @param grade グレード
	 * @param document Document型の英語データ
	 * @return オブジェクトに変換した英語データ
	 */
	public static EigoRecord toObject(String grade, Document document) {

		System.out.println("grade=" + grade);
		System.out.println("document="  + document);

		String id = (String)document.get("id");
		String eigo = (String)document.get("eigo");
		String yomi = (String)document.get("yomi");
		String imi = (String)document.get("imi");
		String hyoji = (String)document.get("hyoji");

		int yomi_ok = 0;
		int yomi_ng = 0;
		int kaki_ok = 0;
		int kaki_ng = 0;

		if (document.get("yomi_ok") instanceof Double) {
			yomi_ok = (int)(double)document.get("yomi_ok");
		} else {
			yomi_ok = (int)document.get("yomi_ok");
		}

		if (document.get("yomi_ng") instanceof Double) {
			yomi_ng = (int)(double)document.get("yomi_ng");
		} else {
			yomi_ng = (int)document.get("yomi_ng");
		}

		if (document.get("kaki_ok") instanceof Double) {
			kaki_ok = (int)(double)document.get("kaki_ok");
		} else {
			kaki_ok = (int)document.get("kaki_ok");
		}

		if (document.get("kaki_ng") instanceof Double) {
			kaki_ng = (int)(double)document.get("kaki_ng");
		} else {
			kaki_ng = (int)document.get("kaki_ng");
		}

		EigoRecord eigoRecord = new EigoRecord(id, eigo, yomi, imi, hyoji, yomi_ok, yomi_ng, kaki_ok, kaki_ng);

		// グレード情報はインスタンス化とは別に設定
		eigoRecord.setGrade(grade);

		return eigoRecord;
	}
}
