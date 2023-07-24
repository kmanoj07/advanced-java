package com.manoj.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("I am gonna be " + name);
    }

    @Override
    void choosePartner(String name) {
        System.out.println(super.age);
        System.out.println("I love "+ name + " she is " + this.age);
    }

    @Override
    public void normal() {
        super.normal(); // this is calling direct parent method
    }
}
