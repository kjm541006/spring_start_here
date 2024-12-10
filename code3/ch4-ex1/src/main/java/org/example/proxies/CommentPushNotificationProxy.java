package org.example.proxies;

import org.example.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void send(Comment comment) {
        System.out.println("Sending Push notification for comment: " + comment.getText());
    }
}
