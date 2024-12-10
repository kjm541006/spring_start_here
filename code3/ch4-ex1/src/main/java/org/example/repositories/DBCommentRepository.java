package org.example.repositories;

import org.example.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("comment.getText() = " + comment.getText());
    }
}
