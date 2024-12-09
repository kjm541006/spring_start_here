package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("person.getName() = " + person.getName());
        System.out.println("parrot.getName() = " + parrot.getName());
        System.out.println("person.getParrot() = " + person.getParrot());
    }
}