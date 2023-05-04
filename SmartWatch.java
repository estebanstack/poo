package com.examples.poo;

public class SmartWatch extends SmartDevice{

    boolean microfono;

    public SmartWatch(){
    }


    public SmartWatch(String marca, String modelo, int factYear, String UI, boolean microfono) {
        super(marca, modelo, factYear, UI);
        this.microfono = microfono;
    }
}
