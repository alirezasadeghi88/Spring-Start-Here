package com.learn.service;

import com.learn.model.Comment;

import java.util.logging.Logger;

public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }
}
