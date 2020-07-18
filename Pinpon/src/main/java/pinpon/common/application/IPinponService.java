package pinpon.common.application;

import java.util.List;

import org.springframework.stereotype.Service;

import pinpon.common.domain.model.IPinponRecord;

@Service
public interface IPinponService {

	public IPinponRecord findBy(String grade, String kanjiId);

	public List<IPinponRecord> findAll(String grade);

	public int count(String grade);

	public void update(String grade, String id, int ok_count, int ng_count);
}
