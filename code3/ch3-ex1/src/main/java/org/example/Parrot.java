package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Koko";

    public Parrot() {
        System.out.println("Parrot Created");
    }

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
