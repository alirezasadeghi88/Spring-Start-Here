package com.learn.service;

import com.learn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentService {
    private final CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
