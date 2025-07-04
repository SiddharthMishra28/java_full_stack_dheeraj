package com.proceduralprogramming.examples;

public class GSM {
    String networkCarrierType;
    String name;
    int frequency;

    public void register() {
        System.out.println("Registering...");
        System.out.println("Registered to "+name);
        System.out.println("Assigned frequency "+frequency);
    }
}
