package oop.polymorphism;

public class Student extends Person { // IS-A

    // METHOD OVERRIDING - POLYMORPHISM
    @Override // Indicator that the parent method is overridden
    public void greet() {
        System.out.println("Good Morning Sir!");
    }

    // METHOD OVERLOADING - POLYMORPHISM
    public void greet(String name) {
        System.out.println("Hello there! "+name);
    }

    public static void main(String[] args) {
        Person p = new Student(); // IS ALLOWED
        p.greet();
    }
}
