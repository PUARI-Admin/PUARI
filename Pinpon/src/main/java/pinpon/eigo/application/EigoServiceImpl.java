package pinpon.eigo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pinpon.common.domain.model.IPinponRepository;
import pinpon.eigo.infrastructure.datasource.EigoRepository;

/**
 * 英語用サービスの実装クラス。
 *
 * @author watanabe
 *
 */
@Service
public class EigoServiceImpl extends EigoService {

	@Autowired
	EigoRepository eigoRepository;

	/**
	 * リポジトリの実装クラスを返却する
	 *
	 */
	@Override
	protected IPinponRepository getRepository() {

		return this.eigoRepository;
	}
}
