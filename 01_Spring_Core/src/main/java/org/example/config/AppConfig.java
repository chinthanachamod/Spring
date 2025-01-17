package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.SpringBean;
import org.example.bean.TestBean1;
import org.example.bean.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackageClasses = TestBean1.class)*/
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {

    /*public AppConfig() {
        System.out.println("AppConfig constructor !");
    }*/

    /*===============================================*/

    /*@Bean("bean2")
    public MyConnection myConnection(){
        return new MyConnection();
    }*/

    /*===============================================*/

    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }

    /*===============================================*/


}
