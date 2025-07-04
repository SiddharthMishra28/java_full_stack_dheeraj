package oop.inheritance;

//INHERITANCE
public class Car extends Vehicle { // IS-A RELATIONSHIP

    public void moveWithGear(int gear) {
        System.out.println("Moving..switched to gear "+gear);
    }

    public static void main(String[] args) {
        Car audi = new Car();
        audi.startVehicle();
        audi.moveWithGear(1);
        audi.stopVehicle();
    }
}
