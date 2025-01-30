package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public void printBean() {
        System.out.println("Spring Bean Constructor");
    }
}
