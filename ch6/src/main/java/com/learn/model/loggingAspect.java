package com.learn.model;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class loggingAspect {
    private Logger logger = Logger.getLogger(loggingAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)",
            returning = "returnedValue")

    public void log(Object returnedValue) {
        logger.info("Method executed and returned " + returnedValue);
    }
}
