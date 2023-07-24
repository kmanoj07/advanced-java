package com.manoj.extendsDemo2;

public interface A {
    default  void fun() {
        System.out.println("fun");
    }
    static void greeting() {
        System.out.println("I am static");
    }
}
