package com.learn;

import com.learn.config.ProjectConfiguration;
import com.learn.model.Comment;
import com.learn.proxy.EmailCommentNotificationProxy;
import com.learn.repository.DBCommentRepository;
import com.learn.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("alireza");
        comment.setText("Hello");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
