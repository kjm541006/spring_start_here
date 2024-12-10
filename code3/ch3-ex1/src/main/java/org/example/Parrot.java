package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Koko";
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }

//    public Parrot() {
//        System.out.println("Parrot Created");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
