package org.example;

import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);

        boolean b1 = cs1 == cs2;
        System.out.println("b1 = " + b1);
    }
}