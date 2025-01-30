package org.example.config;


import org.example.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
/*@ComponentScan(basePackages = "org.example.bean")*/
@Import({AppConfig1.class})
public class AppConfig {

    // run SpringBean from AppConfig
    @Bean
    public SpringBean getSpringBean() {
        return new SpringBean();
    }

}
