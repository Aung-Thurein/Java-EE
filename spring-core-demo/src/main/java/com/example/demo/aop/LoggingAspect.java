package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Configuration
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint){  
    }  
    
    @After("execution(* com.example.demo.controller.*.*(..))")
    public void logAfter(JoinPoint joinPoint){  
    }  

    @Before("execution(* com.example.demo.service.*.*(..))")
    public void logBeforeService(JoinPoint joinPoint){  
    }

    @AfterThrowing(value="execution(* com.example.demo.controller.*.*(..))",throwing = "exception")
	public void doRecoveryActions(Exception exception) {
    }
    
    
  
    @AfterReturning(
    		pointcut="execution(* com.example.demo.controller.*.*(..))",
    		returning="retVal")
	public void doAccessCheck(Object retVal) {

    }
    
    
    @Around("execution(* com.example.demo.service.*.*(..))")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		
    	for(Object param : pjp.getArgs())
    	{
    		
    	}
    	Object retVal =null;
    	retVal = pjp.proceed();
		
		return retVal;
	}
	
}
