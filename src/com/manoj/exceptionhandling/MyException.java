package com.manoj.exceptionhandling;

public class MyException extends Exception {

    public MyException(String message) {
        super(message); // passing my message to Super Exception class
    }
}
