package com.learn.config;

import com.learn.model.Parrot;
import com.learn.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("KOKO");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("ELLA");
        person.setParrot(parrot());
        return person;
    }
}
