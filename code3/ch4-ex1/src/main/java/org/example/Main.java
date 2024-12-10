package org.example;

import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService s1 = context.getBean(CommentService.class);
        UserService s2 = context.getBean(UserService.class);

        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println("s1.getCommentRepository() = " + s1.getCommentRepository());
        System.out.println("s2.getCommentRepository() = " + s2.getCommentRepository());
        System.out.println("b1 = " + b1);
    }
}