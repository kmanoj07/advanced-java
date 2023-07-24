package com.manoj.abstractDemo;

// if a class have one or more abstract method, the class has to be declared as abstract
public abstract class Parent {
    int age;
    public Parent(int age) {
        this.age = age;
    }
    //Now the abstract method only have method signature not body defination
    abstract void career(String name);
    abstract void choosePartner(String name);

    //static method creation in abstract class
    static void hello() {
        System.out.println("Hello");
    }
    //This is a normal method
    public void normal() {
        System.out.println("this is a normal method");
    }
}
