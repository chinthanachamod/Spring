package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
    @Bean
    public SpringBean springBean() {
        return new SpringBean();
    }
}*/

@Configuration
@ComponentScan(basePackages = "org.example.di")
public class AppConfig {
}