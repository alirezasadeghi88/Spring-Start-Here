package com.learn.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class loggingAspect {
    private Logger logger = Logger.getLogger(loggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Security Aspect: Method executed and returned " +
                returnedValue);

        return returnedValue;
    }
}
