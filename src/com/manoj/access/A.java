package com.manoj.access;

public class A {
    private int num;
    private String name;
    protected int id;
    public A(int num, String name, int id) {
        this.num = num;
        this.name = name;
        this.id = id;
    }

    public int getNum() {
        return this.num;
    }

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
}
