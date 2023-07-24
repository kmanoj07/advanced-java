package com.manoj.interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CDPalyer();;

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }
    public void play() {
        media.start();
    }
    public void stopPlay(){
        media.stop();
    }
}
