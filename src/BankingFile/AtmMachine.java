package BankingFile;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import static BankingFile.Bank.balance;
import static BankingFile.Bank.findAccountWith;


public class AtmMachine {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static int accountNumberTransferredFrom;
    private static int accountNumberToWithdrawFrom;


    public static void main(String[] args) {
        gotoMainMenu();

    }

    private static void gotoMainMenu() {
        System.out.println("Welcome to GTBank Platform.");
        String mainMenu = """
                1-> Input
                2-> ExitApplication
                3-> Create Account
                4-> Deposit
                5-> Withdraw
                6-> Check Balance
                7-> Transfer
                8-> Print
                """;
        System.out.println(mainMenu);
        System.out.println("Enter Your Preffered Number: ");
        char userInput = scanner.nextLine().charAt(0);

        switch (userInput) {
            case '1':
                input();
                break;
            case '2':
                exitApplication();
                break;
            case '3':
                createAccount();
                break;
            case '4':
                deposit();
                break;
            case '5':
                withdraw();
                break;
            case '6':
                checkBalance();
                break;
            case '7':
                transfer();
                break;
            case '8': print();
            default:
                gotoMainMenu();


        }

    }

    private static void print() {
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        Account accountNumberToWithdrawFrom = Bank.getAccountNumber(accountNumber);
        String amountToWithdraw = String.valueOf(Integer.parseInt(input("Enter Account Number: ")));
        int pin = Integer.parseInt(input("Enter your desired pin: "));
        Bank.withdrawFrom(amountToWithdraw , pin, accountNumberToWithdrawFrom);


    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        Account customerAccount = Bank.getAccountNumber(accountNumber);
        if (customerAccount != null) {
            int amountToDeposit = Integer.parseInt(input("Enter Account Number: "));
            Bank.deposit(amountToDeposit, accountNumber);
            print("Your deposit of %d is successful. Your balance is %d%n", amountToDeposit);
        } else {
            print("Account not found.");
        }

        gotoMainMenu();


    }

    private static int print(String s, int amountToDeposit) {
        return amountToDeposit;
    }

    private static void createAccount() {
        String firstName = input("Enter your firstName:");
        String lastName = input("Enter your lastName:");
        String pin = input("Enter your desired pin: ");
        int accountNumber = new Random().nextInt(1_000_000_000);
        //Account account = new Account(firstName, lastName, Integer.parseInt(pin), "0", (int) accountNumber);
        //accounts.add(account);
        Account account = new Account(firstName, lastName,pin, balance, accountNumber);
        accounts.add(account);
        print("Account opened Successfully");
        print("Your Account Number is : " + accountNumber);
            gotoMainMenu();

        }

    public static void print(String message){
        System.out.println(message);
}

    private static String input(String message){
        print(message);
        String print = "";
        return print;
}

    //private static Double prompt(String message){
      //  print(message);
        //return Scanner.nextDouble();
    //}

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        String pin = input("Enter pin to check balance: ");
        Account customerAccount = accounts.get(Integer.parseInt(String.valueOf(accountNumber)));
        if (customerAccount != null) {
            if (pin.equals(customerAccount.pin())) {
                print("Your Account Balance is %d%n", customerAccount.balance());
            } else {
                print("Wrong pin");
            }
        } else {
            print("Account not found. Please check the account number.");
        }
        gotoMainMenu();
    }

    private static void transfer() {
        input("Enter Account number to transfer from: ");
        findAccountWith(accountNumberTransferredFrom);
        int accountNumberToTransferTo = Integer.parseInt(input("Enter Account number to transfer To: "));
        findAccountWith(accountNumberToTransferTo);
        int amountToTransfer = Integer.parseInt(input("Enter Account Number: "));
        Bank.transferFrom(amountToTransfer, accountNumberToTransferTo);
    }


    private static void input() {
    }

    private static void exitApplication() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        Account customerAccount = accounts.get(Integer.parseInt(String.valueOf(accountNumber)));
        String pin = input("Enter pin to check balance: ");
        if(customerAccount.equals(pin)) {
            print("Account Log out Successfully");
        }
        else {
            print("Try Again");


    }

    }
}








   


