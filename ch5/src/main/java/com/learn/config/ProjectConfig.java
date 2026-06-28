package com.learn.config;

import com.learn.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.service", resourcePattern = "com.learn.repository")
public class ProjectConfig {


}
