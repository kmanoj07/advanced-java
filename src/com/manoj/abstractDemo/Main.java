package com.manoj.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career("Doctor");
        son.choosePartner("Peeper Bots");

        // Since the abstract class allow the creation iof the constructor
        // it will not allow us to call that constructor
        //Parent parent = new Parent();

        //since no object for the abstract classes but can be called by the class name
        Parent.hello();
        son.normal();
    }
}
