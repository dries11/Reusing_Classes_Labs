package ries.dan.BankAccountManager;

/**
 * Created by danries on 1/18/17.
 */
public class SavingsAccount extends Account {


    public SavingsAccount(int balance, int accountNumber) {
        super(balance, accountNumber);
        this.intRate = 0.01;
    }
}
