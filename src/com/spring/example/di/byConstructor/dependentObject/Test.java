package com.spring.example.di.byConstructor.dependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("com/spring/example/iocContainers/iocContainer-applcationContext.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/example/di/byConstructor/dependentObject/constructor-di-applcationContext.xml");
        Employee employee = (Employee) factory.getBean("employee");
        System.out.println(employee.toString());
    }
}