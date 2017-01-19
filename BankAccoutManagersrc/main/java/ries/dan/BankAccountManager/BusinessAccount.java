package ries.dan.BankAccountManager;

/**
 * Created by danries on 1/18/17.
 */
public class BusinessAccount extends Account {

    public BusinessAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
        this.intRate = 0.05;
    }
}
