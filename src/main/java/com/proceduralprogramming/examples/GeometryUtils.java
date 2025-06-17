package com.proceduralprogramming.examples;

public class GeometryUtils {
    float length;
    float width;
    float height;

    public double calcArea(float length, float width, String figure) {
        this.length = length;
        this.width = width;
        switch (figure) { // SWITCH (MATCHING_VARIABLE)
            case "SQUARE":
                return length * width;

            case "TRIANGLE":
                return 0.5f * length * width;

            default:
                System.err.println("Invalid Figure...");
                return 0f;
        }
    }

    public double calcVolume(float length, float width, float height, String figure) {
        this.length = length;
        this.width = width;
        this.height = height;
        switch (figure) { // SWITCH (MATCHING_VARIABLE)
            case "CUBE":
                return length * height * width;

            case "CONE":
                return (1/3) * Math.PI * length * height;
            case "CYLINDER":
                return Math.PI * length * length * height;
            default:
                System.err.println("Invalid Figure...");
                return 0f;
        }
    }

}
