package com.kano.calc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kano.calc.entity.PlCalcForm;

@Controller
public class KanoCalcController {

	@ModelAttribute("plCalcForm")
	public PlCalcForm setPlCalcForm() {
		return new PlCalcForm();
	}
	
	@GetMapping("/title")
	public String title() {
		return "web/title";
	}

	@PostMapping(value="/pl-calc",params="plCalc")
	public String pagePlCalc(Model model) {
		// modelに遷移先画面のFormのインスタンスを追加する必要があった
		// 追加することで、画面側で入力したデータをサーバに渡すときの器としてのインスタンスが用意される
		model.addAttribute("plCalcForm", new PlCalcForm());
		return "web/plCalc";
	}

//	@GetMapping("/trip-calc")
//	public String pageTripCalc() {
//		return "/web/calc/trip-calc";
//	}
//	
//	@GetMapping("/snowboard-calc")
//	public String pageSnowboardCalc() {
//		return "/web/calc/snowboard/calc";
//	}

//	@PostMapping("/pl-calc-exec")
//	public String execPlCalc() {
//		return "/web/calc/pl-calc";
//	}

//	@PostMapping("/trip-calc-exec")
//	public String execTripClac() {
//		return "/web/calc/trip-calc";
//	}
//	
//	@PostMapping("snowboard-calc-exec")
//	public String execSnowboardCalc() {
//		return "/web/calc/snowboard-calc";
//	}

}
