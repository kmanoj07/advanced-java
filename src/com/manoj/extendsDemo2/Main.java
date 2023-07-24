package com.manoj.extendsDemo2;

public class Main implements A, B {
    // Her, I do not need to override the abstract method provided by the interface A, due to default implementation it will provide
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.greet();
        A.greeting();
    }
}
