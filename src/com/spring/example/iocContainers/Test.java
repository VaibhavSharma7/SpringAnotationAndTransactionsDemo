package com.spring.example.iocContainers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("com/spring/example/iocContainers/iocContainer-applcationContext.xml");
//        ApplicationContext factory = new ClassPathXmlApplicationContext("iocContainer-applcationContext.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/example/iocContainers/iocContainer-applcationContext.xml");
        Student student = (Student) factory.getBean("student");
        student.displayInfo();
    }
}
