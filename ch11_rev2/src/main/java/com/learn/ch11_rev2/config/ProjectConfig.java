package com.learn.ch11_rev2.config;
@Configuration
public class ProjectConfig {

    @Bean
    public WebClient webClient() {
        return WebClient
                .builder()
            .build();

    }
}
