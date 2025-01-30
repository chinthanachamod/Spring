package org.example.bean;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component // bean ekak kiyala pennanawa
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("SpringBean Constructor");
    }

    @Override
    public void setBeanName(String name) {      //from BeanNameAware
        System.out.println("Myconnection BeaNameAware setBeanName");
    }

    @Override
    public void setBeanFactory(org.springframework.beans.factory.BeanFactory beanFactory) {     //from BeanFactoryAware
        System.out.println("Myconnection BeanFactoryAware setBeanFactory");
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) {      //from ApplicationContextAware
        System.out.println("Myconnection ApplicationContextAware setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {     //from InitializingBean
        System.out.println("Myconnection InitializingBean afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {       //from DisposableBean
        System.out.println("Myconnection DisposableBean destroy");
    }
}
