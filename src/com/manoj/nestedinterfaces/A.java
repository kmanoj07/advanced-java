package com.manoj.nestedinterfaces;

public class A {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num ) {
        if((num & 1) == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        B b = new B();
        boolean result = b.isOdd(33);
        System.out.println(result);
    }
}
