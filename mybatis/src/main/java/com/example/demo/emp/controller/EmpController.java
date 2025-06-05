package com.example.demo.emp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.vo.EmpVO;


import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class EmpController {
	 private final EmpService emp;
	 
//	 @GetMapping("/emp")
//	 @ResponseBody
//	 public List<EmpVO> getMethodName(){
//		return emp.getEmpList(); 
//	 }
	 @GetMapping("/emp")
	    public String empList(Model model){
	      model.addAttribute("empList",emp.getEmpList()); 
	       return "empList";
	    }
	 
	 @GetMapping("/elobject")
	    public String test(){
	      //model.addAttribute("empList",emp.getEmpList()); 
	       return "elobject";
	    }
	 
	 
	 
	 
}