package pinpon.jukugo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pinpon.common.domain.model.IPinponRepository;
import pinpon.jukugo.infrastructure.datasource.JukugoRepository;

/**
 * 熟語用サービスの実装クラス。
 *
 * @author watanabe
 *
 */
@Service
public class JukugoServiceImpl extends JukugoService {

	@Autowired
	JukugoRepository jukugoRepository;

	/**
	 * リポジトリの実装クラスを返却する
	 *
	 */
	@Override
	protected IPinponRepository getRepository() {

		return this.jukugoRepository;
	}
}
