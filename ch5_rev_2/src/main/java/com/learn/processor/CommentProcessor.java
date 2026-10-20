package com.learn.processor;

import org.w3c.dom.Comment;

public class CommentProcessor {
    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void getComment() {
        return this.comment;
    }
}
