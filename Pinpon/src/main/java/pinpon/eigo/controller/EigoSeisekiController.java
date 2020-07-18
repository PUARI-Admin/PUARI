package pinpon.eigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pinpon.common.domain.model.IPinponRecord;
import pinpon.eigo.application.EigoService;


@Controller
public class EigoSeisekiController {

	@Autowired
	private EigoService eigoService;

	@RequestMapping(value="/eigo/seiseki/{grade}", method=RequestMethod.POST)
	public String gradeGet(Model model, @PathVariable String grade) {

		List<IPinponRecord> list = eigoService.findAll(grade);

		model.addAttribute("list", list);

		return "eigo_seiseki";
	}

}
