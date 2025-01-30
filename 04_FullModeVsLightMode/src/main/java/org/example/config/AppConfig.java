package org.example.config;

import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
/*
    @Bean
    public SpringBeanTwo getSpringBeanTwo() {
        *//*return new SpringBeanTwo();*//*

        //Inter Bean Dependency
        SpringBeanThree springBeanThree = getSpringBeanThree();
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getSpringBeanThree() {
        return new SpringBeanThree();
    }*/
}
