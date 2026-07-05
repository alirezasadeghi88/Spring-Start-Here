package com.learn;

import com.learn.config.ProjectConfig;
import com.learn.model.Comment;
import com.learn.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("hello");
        comment.setAuthor("alireza");

        String value = service.publishComment(comment);
    }
}
