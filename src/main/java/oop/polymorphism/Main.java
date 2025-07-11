package oop.polymorphism;

import oop.encapsulation.Mobile;

// EXAMPLE CALSS FOR ENCAPSULATION
public class Main extends Mobile {

    public void someMethod() {
       this.screenSize = 5.6;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.ramCapacity = 6; // SCREENSIZE NOT ACCESSIBLE
    }
}
