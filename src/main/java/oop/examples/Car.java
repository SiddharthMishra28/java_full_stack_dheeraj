package oop.examples;

public class Car {

    private String carNum;
    private Chassis chassis;
    private Engine engine;
    private Transmission transmission;

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis=" + chassis +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }

//    public static void main(String[] args) {
//        Car car = new Car();
//
//        Engine engine1 = new Engine();
//        engine1.setEngineCapacity(1000);
//        engine1.setNumCylinders(4);
//        engine1.setEngineType("Petrol");
//
//        Transmission transmission1 = new Transmission();
//        transmission1.setTransmissionType("Auto");
//        transmission1.setNumGears(5);
//
//        car.setEngine(engine1);
//        car.setTransmission(transmission1);
//
//        System.out.println(car);
//    }
}
