package com.spring.example.annotations.componentAndautowired.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("com/spring/example/annotations/componentAndautowired/pack1/componentAndAutowired-applicationContext.xml");
        MovieRecommender movieRecommender = (MovieRecommender) factory.getBean("movieRecommender");
        System.out.println("MovieRecommender >>> " + movieRecommender.toString());
    }
}
