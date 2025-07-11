package oop.composition;

public class Motherboard {

    private String make;
    private String simSlot;
    private int ramCapacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getSimSlot() {
        return simSlot;
    }

    public void setSimSlot(String simSlot) {
        this.simSlot = simSlot;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
}
