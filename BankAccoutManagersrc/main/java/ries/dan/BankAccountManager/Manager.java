package ries.dan.BankAccountManager;

/**
 * Created by danries on 1/18/17.
 */
public class Manager {

    public void createAccount(int type, double startingBalance, int accountNumber ){
        switch (type){
            case 1:
                CheckingAccount checking = new CheckingAccount(startingBalance , accountNumber);

        }
    }

}
