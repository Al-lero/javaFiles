package tdd;


import BankingFile.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {


    private Account account;

    @Test
    public void createAccount(){
        String firstName  = "Alero";
        String lastName = "Yione";
        String pin = "1234";
        int balance = 0;
        int accountNumber = account.getAccountNumber();

        Account account = new Account(firstName,lastName,pin,balance, accountNumber);
        assertEquals(firstName + "" + lastName, account.getAccountNumber());
        assertEquals(pin,account.getPin());
        assertEquals(balance, account.getBalance());
        assertEquals(accountNumber, account.getAccountNumber());
        




    }
}
