package oop.encapsulation;

public class Mobile {
    // 4 TYPES OF ACCESS SPECIFIERS
    // DEFAULT, PUBLIC, PROTECTED, PRIVATE
    String brand; // DEFAULT - IS ACCESSIBLE ONLY INSIDE SAME PACKAGE AS DECLARATION
    public int ramCapacity; // PUBLICLY ACCESSIBLE ACROSS THE PROGRAM
    protected double screenSize; // IS ACCESSIBLE INSIDE SAME PACKAGE OR CHILD CLASSES
    private String lockCode; // ONLY ACCESSIBLE WITHIN CLASS BOUNDARY
    private String os;
    private String networkCode;

    // GENERALLY USED IN SCOPE OF PRIVATE VARIABLES
    // GETter - READS VALUES
    // SETter - WRITE VALUES

    public String getLockCode() {
        return this.lockCode;
    }

    public String getNetworkCode() {
        return this.networkCode;
    }

    public void setLockCode(String lockCode) {
        if(lockCode.length() == 6) {
            this.lockCode = lockCode; // CONSTRAINT
        }
    }

    public void setOs(String os) {
        this.os = os;
    }
}
