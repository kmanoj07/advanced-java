package com.manoj.interfaces;

public class Car implements Engine, Break, Media{
    int a;
    @Override
    public void brake() {
        System.out.println("Break like a normal car");
    }
    @Override
    public void start() {
        System.out.println("Start engine like a normal car");
    }
    @Override
    public void stop() {
        System.out.println("Stop engine like a normal car");
    }
    @Override
    public void acc() {
        System.out.println("Accelerate like a normal car");
    }
}
