package oop;

public class Laptop {
    String screenType;
    String keys;
    float screenSize;
    int ramCapacity;
    String os;

    public void turnLaptopOn() {
        if(os.equalsIgnoreCase("Windows")) {
            System.out.println("Windows Logo..");
        }else if(os.equalsIgnoreCase("Mac")) {
            System.out.println("Welcome to apple ecosystem");
        }else {
            System.out.println("Booting up your laptop");
        }
    }

    public static void main(String[] args) {
        Laptop lenovoLaptop = new Laptop();
        lenovoLaptop.screenType = "LCD";
        lenovoLaptop.keys = "Physical";
        lenovoLaptop.ramCapacity = 16;
        lenovoLaptop.screenSize = 14.5f;
        lenovoLaptop.os = "MAC";
        lenovoLaptop.turnLaptopOn();
    }
}
