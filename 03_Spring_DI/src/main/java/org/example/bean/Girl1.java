package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Girl1 {

    public Girl1() {
        System.out.println("Girl constructor");
    }

    // Tight coupling
    public void chat() {
        System.out.println("CHATTING...");
    }
}
