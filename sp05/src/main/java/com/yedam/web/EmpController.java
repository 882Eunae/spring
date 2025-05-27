package com.yedam.web;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/emp")
@Controller //@componen 컨트롤러, bean등록 
public class EmpController {

	@GetMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("servertime",new java.util.Date()); 
		return "empList"; //forward 
	}
	

	
}
