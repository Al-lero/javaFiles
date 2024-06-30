package BankingFile;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmMachine {

    static Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        gotoMainMenu();

    }

    private static void gotoMainMenu() {
        print("");
        print("Welcome to GTBank Platform.");
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
                input("");
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
            case '8': print("");
            default:
                gotoMainMenu();


        }

    }


    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        int amountToWithdraw = Integer.parseInt(input("Enter Amount: "));
        String pin =input("Enter your pin: ");
        bank.withdrawFrom(accountNumber , pin, amountToWithdraw);
        printF("You've Successfully Withdrawn  ");
        printF(String.valueOf(amountToWithdraw));
        gotoMainMenu();

    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        Account customerAccount = bank.findAccountWith(accountNumber);
        if (customerAccount != null) {
            int amountToDeposit = Integer.parseInt(input("Enter Amount to be deposited: "));
            bank.deposit(amountToDeposit, accountNumber);
            printF("You've Successfully Deposited  ");
            printF(String.valueOf(amountToDeposit));
            print("");
        } else {
            print("Account not found.");
        }

        gotoMainMenu();


    }


    private static void createAccount() {
        String firstName = input("Enter your firstName:");
        String lastName = input("Enter your lastName:");
        String pin = input("Enter your desired pin: ");
        int accountNumber = new Random().nextInt(1_000_000_000);


        Account account = new Account(firstName, lastName,pin, 0, accountNumber);

        bank.addAccount(account);

        print("Account opened Successfully");
        print("Your Account Number is : " + accountNumber);
            gotoMainMenu();

        }

    public static void print(String message){
        System.out.println(message);
}
    private static void printF(String message){
        System.out.printf(message);
    }


    private static String input(String message){
       Scanner scanner = new Scanner(System.in);
       print(message);
        return scanner.nextLine();
}


    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        String pin = input("Enter pin to check balance: ");
        Account customerAccount = bank.findAccountWith(accountNumber);
        if (customerAccount != null) {
            if (pin.equals(customerAccount.pin())) {
                printF("Your account balance is : ");
                printF(String.valueOf(customerAccount.balance()));
            } else {
                print("Wrong pin");
            }
        } else {
            print("Account not found. Please check the account number.");
        }
        gotoMainMenu();
    }

    private static void transfer() {
        int accountNumberToTransferFrom = Integer.parseInt(input("Enter Account number to transfer from: "));

        int accountNumberToTransferTo = Integer.parseInt(input("Enter Account number to transfer To: "));

        int amountToTransfer = Integer.parseInt(input("Enter Amount to transfer : "));

        String pin = input("Enter your pin : ");
        bank.transferFrom(accountNumberToTransferFrom, accountNumberToTransferTo, amountToTransfer,pin);
        printF("You've Successfully Transsferred  ");
        printF(String.valueOf(amountToTransfer));
        printF("to ");
        printF(String.valueOf(accountNumberToTransferTo));
        gotoMainMenu();
    }




    private static void exitApplication() {
        int accountNumber = Integer.parseInt(input("Enter Account Number: "));
        Account customerAccount = bank.findAccountWith(accountNumber);
        String pin = input("Enter pin to check balance: ");
        if(customerAccount.pin().equals(pin)) {
            print("Account Log out Successfully");
        }
        else {
            print("Try Again");


    }

    }
}








   


