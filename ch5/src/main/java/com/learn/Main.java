package com.learn;

import com.learn.config.ProjectConfig;
import com.learn.repository.CommentRepository;
import com.learn.service.CommentService;
import com.learn.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}
