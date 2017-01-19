package ries.dan.BankAccountManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danries on 1/18/17.
 */
public class Account {

    private double balance;
    private double accountNumber;
    double intRate;
    private List<Account> accounts;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.intRate = 0;
        accounts = new ArrayList<Account>();
    }







}
