package com.learn.prototype.config;

import com.learn.prototype.service.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.learn.prototype.service", resourcePattern = "com.learn.prototype.repository")
public class ProjectConfig {


}
