package com.learn;

import com.learn.model.Comment;
import com.learn.proxy.EmailCommentNotificationProxy;
import com.learn.repository.DBCommentRepository;
import com.learn.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("alireza");
        comment.setText("Hello");

        commentService.publishComment(comment);
    }
}
