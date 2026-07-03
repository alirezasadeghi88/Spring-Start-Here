package com.learn.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around("execution(* com.learn.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
    }
}
