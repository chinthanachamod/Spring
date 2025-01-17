package org.example.bean;

import org.springframework.stereotype.Component;

@Component("bean")  // bean ID
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean Constructor");
    }
    public void sayHello(){
        System.out.println("Hello Spring Bean");
    }
}
