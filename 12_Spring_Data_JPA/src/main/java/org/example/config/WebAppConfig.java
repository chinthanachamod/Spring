package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.example.controller"})
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/customer/**")      // Awashya path eka select karanna
                .allowedOrigins("*")    // Onama origin ekk allow karanna
                .allowCredentials(true)     // Credentials allow karanna
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")      // Methods allow karanna
                .allowedHeaders("*");    // Headers allow karanna
    }
}
