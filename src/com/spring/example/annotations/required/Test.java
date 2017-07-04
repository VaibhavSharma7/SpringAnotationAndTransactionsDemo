package com.spring.example.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/example/annotations/required/requiredAnnotation-applicationContext.xml");
        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) factory.getBean("simpleMovieLister");
        System.out.println("SimpleMovieLister >>> " + simpleMovieLister.getClass().getName());
        System.out.println("MovieFinder >>> " + simpleMovieLister.getMovieFinder().getClass().getName());
    }
}
