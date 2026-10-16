package com.learn.proxy;

import com.learn.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {

    }
}
