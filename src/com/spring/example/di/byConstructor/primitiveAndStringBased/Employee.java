package com.spring.example.di.byConstructor.primitiveAndStringBased;

import com.spring.example.di.byConstructor.dependentObject.Address;

public class Employee {
    private int id;
    private String name;
    private String city;


    public Employee() {
        System.out.println(" *** Default Constructor invoked *** ");
    }

    public Employee(int id) {
        System.out.println(" *** id Constructor invoked *** ");
        this.id = id;
    }

    public Employee(String name) {
        System.out.println(" *** name Constructor invoked *** ");
        this.name = name;
    }

    public Employee(int id, String name, String city) {
        System.out.println(" *** id & name Constructor invoked *** ");
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
