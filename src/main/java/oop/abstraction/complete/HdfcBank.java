package oop.abstraction.complete;

public class HdfcBank implements BankingPlatform{
    @Override
    public void deposit(int amount) {
        // HDFC SPECIFIC LOGIC
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void depositCheck(int amount, String checkNo) {

    }

    @Override
    public void generateOtp() {

    }
}
