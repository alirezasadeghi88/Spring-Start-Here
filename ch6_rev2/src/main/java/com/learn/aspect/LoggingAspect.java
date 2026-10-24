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
        String methodName =
        joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                        " will execute");

        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object [] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments);

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }
}
