package pinpon.jukugo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.jukugo.application.JukugoService;


@Controller
public class JukugoSeisekiController {

	@Autowired
	private JukugoService jukugoService;

	@RequestMapping(value="/jukugo/seiseki/{grade}", method=RequestMethod.POST)
	public String gradeGet(Model model, @PathVariable String grade) {

		List<IPinponRecord> list = jukugoService.findAll(grade);

		model.addAttribute("list", list);

		return "jukugo_seiseki";
	}

}
