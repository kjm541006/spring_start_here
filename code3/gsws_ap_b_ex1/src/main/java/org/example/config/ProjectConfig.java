package org.example.config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "koko")
    Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");

        return parrot;
    }

    @Bean(name = "miki")
    Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Miki");

        return parrot;
    }

    @Bean(name = "riki")
    Parrot parrot3(){
        Parrot parrot = new Parrot();
        parrot.setName("Riki");

        return parrot;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
