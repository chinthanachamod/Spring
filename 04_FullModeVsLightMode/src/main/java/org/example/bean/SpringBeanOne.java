package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
public class SpringBeanOne {
    /*System.out.println("SpringBeanOne Constructor");*/

    /*------------------------------------------*/
    /*with gives @Component Annotation*/
    @Bean
    public SpringBeanTwo getSpringBeanTwo() {
        //Inter Bean Dependency
        SpringBeanThree springBeanThree1 = getSpringBeanThree();
        SpringBeanThree springBeanThree2 = getSpringBeanThree();
        System.out.println(springBeanThree1);
        System.out.println(springBeanThree2);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getSpringBeanThree() {
        return new SpringBeanThree();
    }
}
