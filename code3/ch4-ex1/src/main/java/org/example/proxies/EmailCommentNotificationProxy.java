package org.example.proxies;

import org.example.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void send(Comment comment) {
        System.out.println("comment.getText() = " + comment.getText());
    }
}
