package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println("p = " + p); // 스프링이 자동으로 스프링 컨텍스트에 등록하면서 인스턴스를 추가해 null이 아님.
        System.out.println("p.getName() = " + p.getName()); // null -> 인스턴스에 setName을 하지 않았기 때문.
    }
}