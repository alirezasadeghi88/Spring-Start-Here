package com.learn.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.learn.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
       String methodName = joinPoint.getSignature().getName();
       Object [] arguments = joinPoint.getArgs();

       logger.info("Method " + methodName + " with parameters "
               + Arrays.asList(arguments) +  " will execute");
    }
}
