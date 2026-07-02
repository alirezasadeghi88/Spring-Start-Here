package com.learn.singleton;

import com.learn.singleton.config.ProjectConfig;
import com.learn.singleton.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);


        var service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
