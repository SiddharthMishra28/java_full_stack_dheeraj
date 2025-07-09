package oop.abstraction.complete;

public class PhonePe {
    public static void main(String[] args) {
        BankingPlatform platform = new IciciBank();
        platform.deposit(32000);
        platform.withdraw(5000);
        platform.generateOtp();
    }
}
