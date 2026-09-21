package com.learn.ch_11.config;

@Configuration
@EnableFeignClients(
        basePackages = "com.example.proxy")
public class ProjectConfig {
}
