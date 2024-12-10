package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.proxies", "org.example.repositories", "org.example.services"})
public class ProjectConfiguration {

}
