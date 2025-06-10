package com.harish.JobAppWithReactSpringBoot.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

@Before("execution(* com.harish.JobAppWithReactSpringBoot.service..*(..))")
    public void logMethodCall(JoinPoint jp){
        logger.info("Method Called "+ jp.getSignature().getName());
    }
}
