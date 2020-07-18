package pinpon.common.application;

import java.util.List;

import org.springframework.stereotype.Service;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.common.domain.model.IPinponRepository;

@Service
public abstract class AbstractPinponService implements IPinponService {

	protected abstract IPinponRepository getRepository();

	public IPinponRecord findBy(String grade, String kanjiId) {

		return (IPinponRecord)getRepository().findBy(grade, kanjiId);
	}

	public List<IPinponRecord> findAll(String grade) {

		return (List<IPinponRecord>)getRepository().findAll(grade);
	}

	public int count(String grade) {

		return getRepository().count(grade);
	}

	public void update(String grade, String id, int ok_count, int ng_count) {

		getRepository().update(grade, id, ok_count, ng_count);
	}
}
