package org.example;

import org.example.bean.Boy;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*Boy boy = (Boy) context.getBean("boy");
        boy.chatWithGirl();*/

        Boy boy = (Boy) context.getBean("boy");
        boy.chatWithGirl();


        context.registerShutdownHook();

    }
}
