package org.example;

import org.example.bean.*;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean);
        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);
        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);*/

        /*===============================================*/

        /*SpringBean springBean = context.getBean(SpringBean.class);
        springBean.sayHello();*/

        /*context.close();*/

        /*===============================================*/

        /*Runtime.getRuntime().addShutdownHook(new Thread() {         //Shutdown Hook --> JVM eka shutdown wena time eka hoyagena Context eka close karanna
            public void run() {
            System.out.println("Shutdown Hook is running !");
            context.close();
            }
        });*/

        /*context.registerShutdownHook();*/ //Shutdown Hook --> JVM eka shutdown wena time eka hoyagena Context eka close karanna

        /*TestBean3 testBean3 = context.getBean(TestBean3.class);
        System.out.println(testBean3);*/

        /*===============================================*/

        /*Object bean = context.getBean("springBean");    // Context eke bean name eka use kala, 1st letter must be simple
        System.out.println(bean);*/

        /*Object bean = context.getBean("bean");    // bean ID eka use kala
        System.out.println(bean);

        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);
        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
        System.out.println(testBean2);

        context.registerShutdownHook();*/

        /*===============================================*/

        /*MyConnection connection = context.getBean(MyConnection.class);
        System.out.println(connection);*/

        /*MyConnection connection = (MyConnection) context.getBean("been2");    // MyConnection Method ele bean ID eka use kala
        System.out.println(connection);

        context.registerShutdownHook();*/

        /*===============================================*/

        /*MyConnection connection = (MyConnection) context.getBean("getConnection");
        System.out.println(connection);

        context.registerShutdownHook(); */

        /*===============================================*/

        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);
        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);
        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        /*-----------------------------------*/

        MyConnection ref4 = context.getBean(MyConnection.class);
        System.out.println(ref4);
        MyConnection ref5 = context.getBean(MyConnection.class);
        System.out.println(ref5);

        context.registerShutdownHook();

        /*===============================================*/



    }
}
