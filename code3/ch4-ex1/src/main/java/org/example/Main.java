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

        CommentService commentService = c.getBean(CommentService.class);
        UserService userService = c.getBean(UserService.class);

        System.out.println("commentService = " + commentService);
        System.out.println("userService = " + userService);

        boolean b1 = commentService.getCommentRepository() == userService.getCommentRepository();
        System.out.println("b1 = " + b1); // false
    }
}