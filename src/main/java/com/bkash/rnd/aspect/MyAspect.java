package com.bkash.rnd.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@Component
@Aspect
@Slf4j
public class MyAspect {

    @Before("execution(void helloWorld())")
    public void entering(JoinPoint joinPoint){
        log.trace("entering "+joinPoint.getStaticPart().getSignature().toString());
    }

}
