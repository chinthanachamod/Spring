package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    //public SpringBean() {}

    /*-----------------------------------------------------*/

    /*@Autowired(required = false)
    //@Value annotation is used to inject values at runtime
    public SpringBean(@Value("Chinthana") String name, @Value("1") int id, @Value("true") boolean bool) {
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(id);
        System.out.println(bool);
    }

    @Autowired(required = false)
    public SpringBean(@Value("Chamod") String name, @Value("1") int id) {
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
        System.out.println(id);
    }*/

    /*================================================================*/

    @Value("Chinthana")
    private String name;

    public SpringBean() {
        System.out.println("Spring Bean Constructor");
        System.out.println(name);
    }
    // Print : Null


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
