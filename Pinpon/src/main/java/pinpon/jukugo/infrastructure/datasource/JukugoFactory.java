package pinpon.jukugo.infrastructure.datasource;

import org.bson.Document;

import pinpon.jukugo.domain.model.JukugoRecord;

/**
 * Document型のデータを熟語オブジェクトに変換するクラス。
 *
 * @author watanabe
 *
 */
public class JukugoFactory {

	/**
	 * Document型のデータを漢字オブジェクトに変換する。
	 *
	 * @param grade グレード
	 * @param document Document型の熟語データ
	 * @return オブジェクトに変換した熟語データ
	 */
	public static  JukugoRecord toObject(String grade, Document document) {

		String id = (String)document.get("id");
		String jukugo = (String)document.get("jukugo");
		String yomi = (String)document.get("yomi");
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

		JukugoRecord jukugoRecord = new JukugoRecord(id, jukugo, yomi, hyoji, yomi_ok, yomi_ng, kaki_ok, kaki_ng);

		// グレード情報はインスタンス化とは別に設定
		jukugoRecord.setGrade(grade);

		return jukugoRecord;
	}
}
