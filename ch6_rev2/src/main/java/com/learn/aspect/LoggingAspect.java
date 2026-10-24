package com.learn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAspect {
    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        joinPoint.proceed();
    }
}
