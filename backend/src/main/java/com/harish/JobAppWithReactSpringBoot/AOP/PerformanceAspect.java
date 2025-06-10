package com.harish.JobAppWithReactSpringBoot.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {
    private static final Logger logger = LoggerFactory.getLogger(PerformanceAspect.class);

    @Around("execution(* com.harish.JobAppWithReactSpringBoot.service.JobAppService.*(..))")
    public Object roundTripTime(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = jp.proceed();
        long end = System.currentTimeMillis();
        logger.info("Time Taken by "+ jp.getSignature().getName()+" "+(end-start)+" m/s");
        return obj;
    }
}
