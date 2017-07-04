package com.spring.example.annotations.postConstructAndPreDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/example/annotations/postConstructAndPreDestroy/postAndPreConstruct-applicationContext.xml");
        MovieFinder movieFinder = (MovieFinder) factory.getBean("movieFinder");
        System.out.println("movieFinder >>> " + movieFinder.getClass().getName());
    }
}
