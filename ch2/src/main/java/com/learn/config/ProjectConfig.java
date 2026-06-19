package com.learn.config;

import com.learn.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("KOKO");
        return p;
    }

    @Bean
    String hello() {
        return "HELLO";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
