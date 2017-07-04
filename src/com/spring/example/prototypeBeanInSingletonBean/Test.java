package com.spring.example.prototypeBeanInSingletonBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/example/prototypeBeanInSingletonBean/prototypeInSingletonBean-applcationContext.xml");
        RequestProcessor requestProcessor = (RequestProcessor) context.getBean("requestProcessor");
        System.out.println("RequestProcessor >>>> " + requestProcessor);
    }
}
