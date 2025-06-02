package com.company.sp06.common.security;

import java.io.IOException;

import org.hibernate.annotations.Comment;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Component("deniedHandler")
public class CustomAccessDeniedHandler implements AccessDeniedHandler {


	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//에러처리 			
		System.out.println("403에러처리");
		String contextPath=request.getContextPath(); 
		response.sendRedirect(contextPath+"/accessError");
	}
	
}
