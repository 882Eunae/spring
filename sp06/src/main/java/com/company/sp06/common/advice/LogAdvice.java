package com.company.sp06.common.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@Aspect // advice 모여있는 클래스
public class LogAdvice {
	@Pointcut("execution(* com.company..*Impl.*(..))")
	public void allpointcut() {
	} // 메서드명 == 포인트컷 이름

	// Advice 메서드
	@Before("allpointcut()")
	public void logprint(JoinPoint jp) {
		String methodName=jp.getSignature().getName(); 
		log.info("[before]서비스호출"+methodName);
		
		Object[] args=jp.getArgs(); 
		if(args !=null && args.length>0) {
			log.info("파라미터:"+args[0].toString());
		}
	}
	@AfterReturning("allpointcut()")
	public void afterprint() {
		log.info("[after]서비스호출");
	}
	
}
