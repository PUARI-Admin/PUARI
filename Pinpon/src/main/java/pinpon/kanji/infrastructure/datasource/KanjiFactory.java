package pinpon.kanji.infrastructure.datasource;

import org.bson.Document;

import pinpon.kanji.domain.model.KanjiRecord;

/**
 * Document型のデータを漢字オブジェクトに変換するクラス。
 *
 * @author watanabe
 *
 */
public class KanjiFactory {

	/**
	 * Document型のデータを漢字オブジェクトに変換する。
	 *
	 * @param grade グレード
	 * @param document Document型の漢字データ
	 * @return オブジェクトに変換した漢字データ
	 */
	public static KanjiRecord toObject(String grade, Document document) {

		String id = (String)document.get("id");
		String kanji = (String)document.get("kanji");
		String daihyo = (String)document.get("daihyo");
		String onyomi1 = (String)document.get("onyomi1");
		String onyomi2 = (String)document.get("onyomi2");
		String onyomi3 = (String)document.get("onyomi3");
		String onyomi4 = (String)document.get("onyomi4");
		String kunyomi1 = (String)document.get("kunyomi1");
		String kunyomi2 = (String)document.get("kunyomi2");
		String kunyomi3 = (String)document.get("kunyomi3");
		String kunyomi4 = (String)document.get("kunyomi4");
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

		KanjiRecord kanjiRecord = new KanjiRecord(id, kanji, daihyo, onyomi1, onyomi2, onyomi3, onyomi4,
				kunyomi1, kunyomi2, kunyomi3, kunyomi4, hyoji, yomi_ok, yomi_ng, kaki_ok, kaki_ng);

		// グレード情報はインスタンス化とは別に設定
		kanjiRecord.setGrade(grade);

		return kanjiRecord;
	}
}
