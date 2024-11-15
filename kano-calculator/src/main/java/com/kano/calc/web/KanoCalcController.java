package com.kano.calc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class KanoCalcController {

	@GetMapping("/title")
	public String title() {
		return "/web/calc/title";
	}
	
	@GetMapping("/pl-calc")
	public String pagePlCalc() {
		return "/web/calc/pl-calc";
	}
	
	@GetMapping("/trip-calc")
	public String pageTripCalc() {
		return "/web/calc/trip-calc";
	}
	
	@GetMapping("/snowboard-calc")
	public String pageSnowboardCalc() {
		return "/web/calc/snowboard/calc";
	}
	
	@PostMapping("/pl-calc-exec")
	public String execPlCalc() {
		return "/web/calc/pl-calc";
	}
	
	@PostMapping("/trip-calc-exec")
	public String execTripClac() {
		return "/web/calc/trip-calc";
	}
	
	@PostMapping("snowboard-calc-exec")
	public String execSnowboardCalc() {
		return "/web/calc/snowboard-calc";
	}
	
}
