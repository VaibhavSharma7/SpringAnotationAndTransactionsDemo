package com.spring.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("com/spring/example/iocContainers/iocContainer-applcationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/example/autowire/autowire-applcationContext.xml");
        A a = context.getBean("aBean", A.class);
        a.display();
    }
}