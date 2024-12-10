package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);

        System.out.println("p.getName() = " + p.getName());
        System.out.println("p.getParrot() = " + p.getParrot());
    }
}