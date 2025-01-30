package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI {
    // property injection
    /*@Autowired*/
    Agreement girl;

    // Constructor injection
    /*@Autowired
    public Boy(Agreement girl) {
        this.girl = girl;
    }*/

    // Setter method through injection
    /*@Autowired
    public void setter(Agreement girl) {
        this.girl = girl;
    }*/


    public void chatWithGirl() {
        girl.chat();
    }


    //interface through injection
    @Autowired
    @Override
    public void inject(Agreement agreement) {
        this.girl = agreement;
    }


}
