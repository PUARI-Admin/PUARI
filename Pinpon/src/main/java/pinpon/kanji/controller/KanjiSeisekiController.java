package pinpon.kanji.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.kanji.application.KanjiService;


@Controller
public class KanjiSeisekiController {

	@Autowired
	private KanjiService kanjiService;

	@RequestMapping(value="/kanji/seiseki/{grade}", method=RequestMethod.POST)
	public String gradeGet(Model model, @PathVariable String grade) {

		System.out.println("seiseki");
		List<IPinponRecord> list = kanjiService.findAll(grade);

		model.addAttribute("list", list);

		return "kanji_seiseki";
	}

}
