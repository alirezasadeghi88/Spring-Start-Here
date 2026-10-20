package com.learn.service;

import com.learn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
