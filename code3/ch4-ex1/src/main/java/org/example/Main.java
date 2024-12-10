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

        String[] beanNames = c.getBeanDefinitionNames();
        System.out.println("등록된 빈 목록:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        System.out.println("Before retrieving the CommentService");
        CommentService service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}