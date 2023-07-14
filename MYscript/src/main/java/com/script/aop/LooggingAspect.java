package com.script.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LooggingAspect {

	private static final Logger LOGGER=LoggerFactory.getLogger(LooggingAspect.class);
	
	@Before("execution (* com.script..*.*(..))")
		public void beforeMethod(JoinPoint jp)
		{
			 String MethodName=  jp.getSignature().getName();
			 String ClassName= jp.getTarget().getClass().toString();
			LOGGER.trace("Enter into the method"+MethodName+"class Name"+ClassName);
		}
	
		@After("execution (* com.script..*.*(..))")
		public void afterMethod(JoinPoint jp)
		{
			String MethodName=  jp.getSignature().getName();
			 String ClassName= jp.getTarget().getClass().toString();
			LOGGER.trace("Exit From the method"+MethodName+"class Name"+ClassName);   
			
		}
}
