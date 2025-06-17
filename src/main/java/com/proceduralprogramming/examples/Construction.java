package com.proceduralprogramming.examples;

public class Construction extends GeometryUtils{
    public static void main(String[] args) {
        Construction c = new Construction();
        double area = c.calcArea(3f, 5f, "TRIANGLE");
        System.out.println("Area is "+area);
    }
}
