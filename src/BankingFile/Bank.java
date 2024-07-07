package BankingFile;


import java.util.ArrayList;
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

   public void addAccount(Account account) {
        accounts.add(account);
    }

   private static void addCustomer(String firstName, String lastName) {

    }


    public void withdrawFrom(int accountNumberToWithdrawFrom, String pin, int amountToWithdraw) {
        Account currentCustomer = findAccountWith(accountNumberToWithdrawFrom);
        if (currentCustomer != null) {
            String intialBalance = String.valueOf(accountNumberToWithdrawFrom);
            if (currentCustomer.checkBalance(intialBalance) >=  amountToWithdraw) {
                currentCustomer.withdraw(amountToWithdraw, pin);
            } else {
                System.out.println("Insufficient Amount");
            }
        } else {
            System.out.println("Invalid Pin");
        }

    }


    public Account findAccountWith(int accountNumber) {

        for (Account account : accounts) {
            int currentAccountNumber = account.getAccountNumber();
            if (currentAccountNumber == accountNumber) {
                return account;
            }
        }
        return null;

    }

    public  int getNumbersOfCustomers() {
        return accounts.size();

    }

    public void transferFrom(int accountNumberTransferredFrom, int accountNumberTransferredTo, int amount,String pin) {
        Account customerToTransferFrom = findAccountWith(accountNumberTransferredFrom);
        Account customerToTransferTo = findAccountWith(accountNumberTransferredTo);
        if (customerToTransferFrom != null && customerToTransferTo != null) {
            String intialBalance = String.valueOf(accountNumberTransferredFrom);
            if (customerToTransferFrom.checkBalance(intialBalance) > amount) {
                customerToTransferFrom.withdraw(amount, pin);
                customerToTransferTo.deposit(amount);
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


    private  int checkBalanceFor(int accountNumber, String firstName) {
        Account currentCustomer = findAccountWith(accountNumber);
        if (currentCustomer != null) {
            String intialBalance = String.valueOf(accountNumber);
            currentCustomer.deposit(Integer.parseInt(String.valueOf(amount)));
        } else {
            System.out.println("Invalid Account Number");
        }
        return balance;
    }



    public  Account getAccountNumber(int accountNumber) {
        if (customerAccount == accountNumber) {
            return getAccountNumber;
        }
   
        return null;
        
    }

    public void deposit(int amountToDeposit, int accountNumber) {
        Account currentCustomer = findAccountWith(accountNumber);
        if (currentCustomer != null) {
           currentCustomer.deposit(amountToDeposit);
        } else {
            System.out.println("Invalid Account Number");
        }

    }



}









