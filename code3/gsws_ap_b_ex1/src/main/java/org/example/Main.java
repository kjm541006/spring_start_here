package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("miki", Parrot.class);
        System.out.println("p.getName() = " + p.getName());

        String s = context.getBean(String.class);
        System.out.println("s = " + s);

        Integer n = context.getBean(Integer.class);
        System.out.println("n = " + n);
    }
}