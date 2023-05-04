package com.examples.poo;

public class Main {

    public static void main(String[] args) {
        SmartDevice device = new SmartDevice("Iphone", "X", 2010, "IOS 10");
        System.out.println(device);
        
        SmartPhone phone = new SmartPhone("Samsung", "A22", 2022, "Android 13", true );
        System.out.println(phone);

        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Fit 2", 2018, "Android", false);
        System.out.println(watch);

    }
}
