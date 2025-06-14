package oop;

public class Animal {
    // noun
    String species;
    int numLegs;
    int height;

    // verbs
    public void move() {
        System.out.println("Animal moving..");
    }

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.move();
    }
}
