package org.example;

import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService commentService1 = c.getBean("commentService", CommentService.class);
        CommentService commentService2 = c.getBean("commentService", CommentService.class);

        System.out.println("commentService1 = " + commentService1);
        System.out.println("commentService2 = " + commentService2);

        boolean b1 = commentService1 == commentService2;
        System.out.println("b1 = " + b1); // false
    }
}