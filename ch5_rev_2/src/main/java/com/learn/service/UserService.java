package com.learn.service;

import com.learn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
