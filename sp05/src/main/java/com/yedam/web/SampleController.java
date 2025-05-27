package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
}
