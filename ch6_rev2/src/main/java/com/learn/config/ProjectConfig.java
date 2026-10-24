package com.learn.config;

import com.learn.aspect.LoggingAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.learn.service")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        joinPoint.proceed();
    }
}
