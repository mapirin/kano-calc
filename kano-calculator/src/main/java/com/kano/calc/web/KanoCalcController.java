package com.kano.calc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KanoCalcController {

	@GetMapping("/title")
	public String title() {
		return "web/calc/title";
	}

	@PostMapping(value="/pl-calc",params="plCalc")
	public String pagePlCalc() {
		return "web/calc/plCalc";
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
