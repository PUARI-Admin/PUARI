package pinpon.kanji.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pinpon.common.domain.model.IPinponRepository;
import pinpon.kanji.infrastructure.datasource.KanjiRepository;

/**
 * 漢字用サービスの実装クラス。
 *
 * @author watanabe
 *
 */
@Service
public class KanjiServiceImpl extends KanjiService {

	@Autowired
	KanjiRepository kanjiRepository;

	/**
	 * リポジトリの実装クラスを返却する
	 *
	 */
	@Override
	protected IPinponRepository getRepository() {

		return this.kanjiRepository;
	}
}
