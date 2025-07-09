package oop.abstraction.partial;

// PARTIAL ABSTRACTION
public abstract class MapUtils {

    String source;
    String destination;
    double distance;
    double displacement;
    String metricUnit;

    public int calculateDisplacement() {
        // LOGIC
        return 0;
    }

    public int calculateDistance() {
        // LOGIC
        return 0;
    }

    public abstract String getSatelliteView();

    public static void main(String[] args) {
        // MapUtils utils = new MapUtils(); // CANNOT INSTANTIATE AN ABSTRACT CLASS
    }
}
