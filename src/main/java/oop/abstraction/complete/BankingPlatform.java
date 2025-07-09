package oop.abstraction.complete;

/**
 * <p>Enables a user to transact and administer banking activities</p>
 */
public interface BankingPlatform { // ALL INTERFACES ARE BY DEFAULT ABSTRACT

    /**
     * <p>Lets a user deposit X amount into his or her bank account</p>
     * @param amount
     */
    void deposit(int amount);

    void withdraw(int amount);

    void depositCheck(int amount, String checkNo);

    void generateOtp();
}
