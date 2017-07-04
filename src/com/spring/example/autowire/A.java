package com.spring.example.autowire;

public class A {
    B bBean;

    A() {
        System.out.println("*** Class A : Default constructor invoked ***");
    }

    A(B bBean) {
        this.bBean = bBean;
        System.out.println("*** Class A : Parametrized  constructor invoked ***");
    }

    public B getbBean() {
        return bBean;
    }

    public void setbBean(B bBean) {
        System.out.println("*** Class A : setbBean() invoked ***");
        this.bBean = bBean;
    }

    void print() {
        System.out.println("*** Class A : print() invoked ***");
    }

    void display() {
        System.out.println("*** Class A : display() invoked ***");
        print();
        if (bBean != null)
            bBean.print();
    }
}
