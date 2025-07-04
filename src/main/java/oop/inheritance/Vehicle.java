package oop.inheritance;

public class Vehicle {
    String company;
    String type;
    String fuel;
    int numWheels;

    public void startVehicle() {
        System.out.println("Vehicle Started...");
    }

    public void move() {
        System.out.println("Vehicle moving..");
    }

    public void stopVehicle() {
        System.out.println("Vehicle Stopped!");
    }

    public static void main(String[] args) {
        Vehicle utilityVehicle = new Vehicle();
        utilityVehicle.startVehicle();
    }
}
