package com.example.ch10_ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello!";
    }

    @GetMapping("/ciao")
    public String getCiao(){
        return "Ciao!";
    }
}
