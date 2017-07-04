package com.spring.example.di.byConstructor.dependentObject;

public class Employee {
    private int id;
    private String name;
    private Address address;

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

    public Employee(Address address) {
        System.out.println(" *** address Constructor invoked *** ");
        this.address = address;
    }

    public Employee(int id, String name, Address address) {
        System.out.println(" *** id , name & addressConstructor invoked *** ");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
