package com.spring.example.autowire;

public class B {
    B() {
        System.out.println("*** Class B : Default constructor invoked ***");
    }

    void print() {
        System.out.println("*** Class B :  print() invoked ***");
    }
}
