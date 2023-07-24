package com.manoj.interfaces;

public class Main {
    public static void main(String[] args) {
        //Engine car = new Car(); // dynamic method dispatch / overriding / at run time which method will run determined at runtime
        //car.a; // not able to access -- it depends on what version to be access depend on the type of object
        //int a = car.a;
        //car.acc();
        //car.start();
        //car.stop();

        /*Media carMedia = new Car();
        car.acc();
        carMedia.start();
        carMedia.stop();*/
        NiceCar niceCar = new NiceCar();
        niceCar.acc();
        niceCar.start();
        niceCar.stop();

        NiceCar niceCar2 = new NiceCar(new ElectricEngine());
        niceCar2.acc();
        niceCar2.start();
        niceCar2.stop();

        niceCar2.play();
        niceCar2.stopPlay();
    }
}
