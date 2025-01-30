package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    /*@Autowired
    Girl girl;*/

    @Qualifier("girl1")
    @Autowired
    Agreement girl;

    public Boy() {
        System.out.println("Boy constructor");
    }

    // Tight coupling
    public void chatWithGirl() {
        /*Girl girl = new Girl();*/
        girl.chat();
    }
}
