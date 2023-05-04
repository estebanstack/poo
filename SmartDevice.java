package com.examples.poo;

public class SmartDevice {
    String marca;
    String modelo;
    int factYear;
    String UI;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, int factYear, String UI){
        this.marca = marca;
        this.modelo = modelo;
        this.factYear = factYear;
        this.UI = UI;

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", factYear=" + factYear +
                ", UI='" + UI + '\'' +
                '}';
    }
}
