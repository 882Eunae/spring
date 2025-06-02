package com.company.sp06.sample.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.sp06.sample.service.SampleService;
import com.company.sp06.sample.service.TimeService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Controller
public class SampleController {
	
    private final TimeService timeService;
	private final SampleService sampleService;
	
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
				
		model.addAttribute("serverTime", timeService.getTime2() );
		
		return "/home";
	}
	
	@GetMapping("/")
	public String main() {
		//int i=5/0; // -> ERROR 발생시 CommonExceptionAdvice.java 로 이동 -> 
		
		sampleService.sample(""); 
		return "home"; 
	}
	@GetMapping({"/all","/member","/admin","/accessError","/login"})
	public void all(HttpServletRequest request) {
	   System.out.println(request.getRequestURI());
	}
	
	
}
