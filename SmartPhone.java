package com.examples.poo;

public class SmartPhone extends SmartDevice {

    boolean sensorHuella;

    public SmartPhone(){
    }

    public SmartPhone(String marca, String modelo, int factYear, String UI,  boolean sensorHuella) {
        super(marca, modelo, factYear, UI);
        this.sensorHuella = sensorHuella;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sensorHuella=" + sensorHuella +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", factYear=" + factYear +
                ", UI='" + UI + '\'' +
                '}';
    }
}
