package com.learn;

import com.learn.config.ProjectConfig;
import com.learn.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("parrot3", Parrot.class);
        System.out.println(p.getName());
    }
}
