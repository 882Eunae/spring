package com.company.book.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.book.service.BookService;
import com.company.book.service.BookVO;
import com.company.sample.service.SampleService;
import com.company.sample.service.TimeService;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@RequiredArgsConstructor
@RequestMapping("/book")
@Controller
public class BookController {
	
	final BookService bookservice; 
   
	@GetMapping("/register") //등록화면으로 이동 
	public String home(Locale locale, Model model) {
		
		return "book/register";
	}
	
	@PostMapping("register")
	public String register(BookVO book,RedirectAttributes rttr) {
		  bookservice.bookinsert(book); 
		  rttr.addAttribute("result",book.getBookNo());
		return "redirect:list"; 
	}
		
	@GetMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("list",bookservice.findAll());
		return "book/list"; 
	}
	@GetMapping("/rentList")
	public String rentPage(Model model) {
		model.addAttribute("list",bookservice.findAllRent());
		return "book/rentList"; 
	}

	
}