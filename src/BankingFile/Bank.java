package BankingFile;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static BankingFile.AtmMachine.accounts;


public class Bank {
    private static ArrayList<Account> accounts = new java.util.ArrayList<>();
    private static char[] amount;
    private static int balance;
    int numberOfCustomer;
    static Random rand = new Random();


    private static void addAccount(Account account) {
        accounts.add(account);
    }

    private static void addCustomer(String firstName, String lastName) {

    }

    private static void withdrawFrom(int accountNumber, int pin, String amount) {
        Account currentCustomer = findAccountWith(accountNumber);
        if (currentCustomer != null) {
            String intialBalance = String.valueOf(accountNumber);
            if (currentCustomer.checkBalance(intialBalance) < Integer.parseInt(amount)) {
                currentCustomer.withdraw(Integer.parseInt(amount), String.valueOf(pin));
            } else {
                System.out.println("Insufficient Amount");
            }
        } else {
            System.out.println("Invalid Pin");
        }

    }

    private static Account findAccountWith(int accountNumber) {
        for (Account account : accounts) {
            int currentAccountNumber = account.getAccountNumber();
            if (currentAccountNumber == accountNumber) {
                return account;
            }
        }
        return null;

    }

    private static int getNumbersOfCustomers() {
        return accounts.size();

    }

    private static void transferFrom(int accountNumberTransferredFrom, int accountNumberTransferredTo, int pin, String amount) {
        Account customerToTransferFrom = findAccountWith(accountNumberTransferredFrom);
        Account customerToTransferTo = findAccountWith(accountNumberTransferredTo);
        if (customerToTransferFrom != null && customerToTransferTo != null) {
            String intialBalance = String.valueOf(accountNumberTransferredFrom);
            if (customerToTransferFrom.checkBalance(intialBalance) > Integer.parseInt(amount)) {
                customerToTransferFrom.withdraw(Integer.parseInt(amount), String.valueOf(pin));
                customerToTransferTo.deposit(Integer.parseInt(amount));
            } else {
                System.out.println("Insufficient Amount");
            }
        } else {
            System.out.println("Account Number Not Founc");
        }
    }

    private static int generateAccountNumber() {
        int accountNumber = new Random().nextInt(1_000_000_000);
        return accountNumber;
    }


    private static int checkBalanceFor(int accountNumber, String firstName) {
        Account currentCustomer = findAccountWith(accountNumber);
        if (currentCustomer != null) {
            String intialBalance = String.valueOf(accountNumber);
            currentCustomer.deposit(Integer.parseInt(String.valueOf(amount)));
        } else {
            System.out.println("Invalid Account Number");
        }
        return balance;
    }
    
}








