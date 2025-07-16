package oop.examples;

public class Chassis {
    private String type;
    private double length;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "type='" + type + '\'' +
                ", length=" + length +
                '}';
    }
}
