package com.yedam;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;


@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		// place your code here
		System.out.println("서블릿 실행전");
		//인코딩,권한체크 
		chain.doFilter(request, response);
		System.out.println("서블릿 실행후");
		//로그 기록 
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
