package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.Employees;
import com.yedam.domain.EmployeesDepartmentListVO;
import com.yedam.domain.EmployeesDepartmentVO;
import com.yedam.domain.SampleDTO;

@Controller
public class SampleController {
    @GetMapping("/ex01")
    public String ex01(SampleDTO sample,Model model) {
    	System.out.println(sample);
    	model.addAttribute("dept","개발"); 
    	return "main";
    }
    	
    @GetMapping("/ex02")
    public String ex02(@RequestParam(name = "name") String name,
    				   @RequestParam(name="age",
    				   required=false, 
    				   defaultValue="20") int age) {
    	System.out.println(name);
    	System.out.println(age);
    	return "main"; 
    } 
    
    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("hobby")
    				  List <String> param) {
    	System.out.println(param);
    	return "main"; 
    } 
    
    @GetMapping("/ex03/{class}/{stdno}")
    public String ex03(@PathVariable(name="class") String class1,
    				   @PathVariable(name="stdno") String stdno){
    	System.out.print("class:");
    	System.out.println(class1+"stdno:" +stdno);
    	return "main"; 
    } 
    
    @PostMapping("/ex04")
    public String ex04(@RequestBody EmployeesDepartmentVO sample) {
    	System.out.println(sample);
    	return "main"; 
    }
    
    @PostMapping("/ex05")
    public String ex05(@RequestBody EmployeesDepartmentListVO entity) {
    	//entity 만들기 
    	System.out.println(entity);
    	return "main"; 
    }
    
    @PostMapping("/ex06")
    @ResponseBody //응답을 json형식으로 
    public SampleDTO ex06(@RequestBody SampleDTO sample) {
   
    	return sample; 
    }
    @GetMapping("/ex07")
    @ResponseBody
    public String ex07() {
    	return "main"; 
    }
    @GetMapping("/ex08")
    public String ex08(Model model,RedirectAttributes rttr) {
    	rttr.addFlashAttribute("msg","휘발성파라미터"); //휘발성  
    	rttr.addAttribute("name","홍길동");  // ?name=aa 쿼리스트링 처리
    	model.addAttribute("msg2","휘바성파라미터"); //넘겨지지않음  
    	System.out.println(model);
    	return "redirect:ex01"; 
    }
    
    
     
    
    
}
