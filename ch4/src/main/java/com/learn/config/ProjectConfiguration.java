package com.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.repository", resourcePattern = "com.learn.proxy"
    , value = "com.learn.service")
public class ProjectConfiguration {
}
