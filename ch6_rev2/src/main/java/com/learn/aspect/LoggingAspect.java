package com.learn.aspect;

import com.learn.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import java.util.Arrays;
import java.util.logging.Logger;

public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());


    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect: Method executed and returned " +
                returnedValue);

        return returnedValue;
    }
}
