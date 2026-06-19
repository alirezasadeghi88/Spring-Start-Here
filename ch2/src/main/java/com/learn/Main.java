package com.learn;

import com.learn.config.ProjectConfig;
import com.learn.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(parrot.getName());
    }
}
