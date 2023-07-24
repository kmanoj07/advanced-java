package com.manoj.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(1, "Manoj", 100);
        //access the member
        //obj.name = "Sam";
        //obj.num = 20;

        //making the member private - hide the data using access modifier
        //private and accessing it by getters and setters

        //access the protected data member of the object
        //In the same package accessibility is allowed
        //outside the package the accessibility not allowed
        int i  = obj.id;
    }
}
