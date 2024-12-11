package org.example;

import org.example.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfiguration {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(){
        return new CommentService();
    }
}
