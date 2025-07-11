package oop.composition;

public class Phone {
    private Motherboard asusMotherboard; // HAS-A RELATIONSHIP
    private Os androidOs;
    private Screen lcdScreen;

    public Motherboard getAsusMotherboard() {
        return this.asusMotherboard;
    }

    public Os getAndroidOs() {
        return this.androidOs;
    }

    public Screen getLcdScreen() {
        return this.lcdScreen;
    }

    public void setAsusMotherboard(Motherboard motherboard) {
        this.asusMotherboard = motherboard;
    }

    public void setAndroidOs(Os os) {
        this.androidOs = os;
    }

    public void setLcdScreen(Screen screen) {
        this.lcdScreen = screen;
    }

    public static void main(String[] args) {
//        Phone myPhone = new Phone();
        Motherboard gigaByteMotherboard = new Motherboard();
        gigaByteMotherboard.setMake("Gigabyte");
        gigaByteMotherboard.setRamCapacity(6);
        gigaByteMotherboard.setSimSlot("Micro");

        Os androidOs = new Os();
        androidOs.setOsName("Android Applepie");
        androidOs.setMinimumRam(4);

        Screen ledScreen = new Screen();
        ledScreen.setScreenType("LED");
        ledScreen.setScreenSize(6.1);
//        myPhone.androidOs = androidOs;
//        myPhone.asusMotherboard = gigaByteMotherboard;
//        myPhone.lcdScreen = ledScreen;
        Phone nokiaPhone = new Phone();
        nokiaPhone.setLcdScreen(ledScreen);
        nokiaPhone.setAsusMotherboard(gigaByteMotherboard);
        nokiaPhone.setAndroidOs(androidOs);
    }
}
