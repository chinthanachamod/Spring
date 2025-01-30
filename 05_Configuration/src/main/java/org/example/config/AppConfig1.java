package org.example.config;


import org.example.bean.SpringBean1;
import org.springframework.context.annotation.*;

@Configuration
/*@ComponentScan(basePackages = "org.example.bean")*/
@Import({AppConfig1.class})

//root
//@ImportResource("classpath:abc.xml") // to import xml file in java config
/*if not*/
//without root
//@ImportResource("file:absolute-path-of-abc.xml")

public class AppConfig1 {

    // run SpringBean from AppConfig1
    @Bean
    public SpringBean1 getSpringBean() {
        return new SpringBean1();
    }

}
