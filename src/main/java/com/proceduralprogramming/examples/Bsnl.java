package com.proceduralprogramming.examples;

public class Bsnl extends GSM { // IS-A

    @Override // STANDARD PRACTICE
    public void register() {
        System.out.println("Registering...");
        System.out.println("Registered to "+name);
        System.out.println("Assigned frequency "+frequency);
        System.out.println("Registeted to Cellone!");
    }

    // OVERLOADED METHOD
    public void register(String networkType) {
        if(networkType.equalsIgnoreCase("3G")) {
            this.frequency = 20000;
        }else if(networkType.equalsIgnoreCase("EDGE")) {
            this.frequency = 15000;
        }else {
            this.frequency = 48000;
        }
        System.out.println("Registering...");
        System.out.println("Registered to "+name);
        System.out.println("Assigned frequency "+this.frequency);
        System.out.println("Registeted to Cellone!");
    }

    public static void main(String[] args) {
        Bsnl newSim = new Bsnl();
        newSim.name = "Cellone";
        newSim.register("EDGE");
    }
}
