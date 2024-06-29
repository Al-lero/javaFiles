package BankingFile;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Bank {
    private static ArrayList<Account> accounts = new java.util.ArrayList<>();
    private static char[] amount;
    static int balance;
    private static int customerAccount;
    private static Account getAccountNumber;
    private static int deposit;
    private static int transfer;
    private static String[] pin;
    int numberOfCustomer;
    static Random rand = new Random();

    private static void addAccount(Account account) {
        accounts.add(account);
    }

    private static void addCustomer(String firstName, String lastName) {

    }


    static int withdrawFrom(String accountNumberToWithdrawFrom, int pin, int amountToWithdraw) {
        Account currentCustomer = findAccountWith(Integer.parseInt(accountNumberToWithdrawFrom));
        if (currentCustomer != null) {
            String intialBalance = String.valueOf(accountNumberToWithdrawFrom);
            if (currentCustomer.checkBalance(intialBalance) < Integer.parseInt(String.valueOf(amountToWithdraw))) {
                currentCustomer.withdraw(Integer.parseInt(String.valueOf(amountToWithdraw)), String.valueOf(pin));
            } else {
                System.out.println("Insufficient Amount");
            }
        } else {
            System.out.println("Invalid Pin");
        }

        return pin;
    }


    static Account findAccountWith(int accountNumber) {
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

    static void transferFrom(int accountNumberTransferredFrom, int accountNumberTransferredTo) {
        Account customerToTransferFrom = findAccountWith(accountNumberTransferredFrom);
        Account customerToTransferTo = findAccountWith(accountNumberTransferredTo);
        if (customerToTransferFrom != null && customerToTransferTo != null) {
            String intialBalance = String.valueOf(accountNumberTransferredFrom);
            if (customerToTransferFrom.checkBalance(intialBalance) > Integer.parseInt(Arrays.toString(amount))) {
                customerToTransferFrom.withdraw(Integer.parseInt(Arrays.toString(amount)), String.valueOf(pin));
                customerToTransferTo.deposit(Integer.parseInt(Arrays.toString(amount)));
            } else {
                System.out.println("Insufficient Amount");
            }
        } else {
            System.out.println("Account Number Not Found");
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



    public static Account getAccountNumber(int accountNumber) {
        if (customerAccount == accountNumber) {
            return getAccountNumber;
        }
   
        return null;
        
    }

    public static int deposit(int amountToDeposit, int accountNumber) {
        return deposit;
    }


    public static void withdrawFrom(String amountToWithdraw, int pin, Account accountNumberToWithdrawFrom) {
    }
}









