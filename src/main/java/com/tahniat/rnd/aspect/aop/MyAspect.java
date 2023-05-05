package com.tahniat.rnd.aspect.aop;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@Component
@Aspect
@Slf4j
public class MyAspect {


	@Before("@annotation(com.tahniat.rnd.aspect.annotation.Idempotent)")
	public void entering(JoinPoint joinPoint) {
		log.trace("entering " + joinPoint.getStaticPart().getSignature().toString());
	}


	@AfterReturning(pointcut = "@annotation(com.tahniat.rnd.aspect.annotation.Idempotent)")
	public void exiting(JoinPoint joinPoint) {
        log.trace("exiting " + joinPoint.getStaticPart().getSignature().toString());
	}

	@AfterThrowing(pointcut = "@annotation(com.tahniat.rnd.aspect.annotation.Idempotent)", throwing = "ex")
	public void doAfterThrowing(JoinPoint joinPoint, Throwable ex) {
		log.error("error occurred during method execution: {}", ex.getMessage());
	}


}
