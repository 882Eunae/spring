package com.company.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@GetMapping("/api")
	public String main() {
		return "home"; // /WEB-INF/views/home.jsp --> body 태그안에 메시지 
	}
	
}
