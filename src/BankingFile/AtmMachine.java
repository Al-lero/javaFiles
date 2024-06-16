package BankingFile;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AtmMachine {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner inputted = new Scanner(System.in);
    static Random rand = new Random();
    private static String getAccountNumber;
    private Bank bank = new Bank();

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
        char userInput = inputted.nextLine().charAt(0);

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
                //checkBalance();
                break;
            case '7':
                transfer();
                break;
            //case '8': print(); break;
            default:
                gotoMainMenu();


        }

    }

    private static void transfer() {
    }


    private static void input() {
    }

    private static void exitApplication() {

    }

    private static void createAccount() {
        System.out.println("Enter Your First name: ");
        String firstName = inputted.nextLine();
        System.out.println("Enter Your Last Name: ");
        String lastName = inputted.nextLine();
        System.out.println("Enter Your Preferred Pin: ");
        String pin = inputted.nextLine();
        int accountNumber = new Random().nextInt(1_000_000_000);
        Account account = new Account(firstName, lastName, Integer.parseInt(pin), "0", (int) accountNumber);
        accounts.add(account);
        System.out.println("Account opened Successfully");
        System.out.println("Your Account Number is : " + accountNumber);
        gotoMainMenu();

    }

    private static void deposit() {
        System.out.println("Enter Your Account Number: ");
        String accountNumber = inputted.nextLine();
        Account customerAccount = getAccountNumber(accountNumber);
            if (customerAccount != null) {
                System.out.println("Enter Amount to deposit: ");
                int amount = inputted.nextInt();
                customerAccount.deposit(amount);
                System.out.printf("Your deposit of %d is successful. Your balance is %d%n", amount, customerAccount.getBalance());
            } else {
                System.out.println("Account not found.");
            }

            gotoMainMenu();


        }

        private static Account getAccountNumber (String accountNumber){
            for (Account account1 : accounts) {
                if(account1 != null && account1.accountNumber.equals(this.accountNumber)) {
                    return account1;
                }
            }
            return null;
        }


        private static void withdraw () {
        }

//        private static void checkBalance () {
//            System.out.println("Enter Your Account Number: ");
//            String accountNumber = inputted.nextLine();
//            System.out.println("Enter pin to check balance: ");
//            String pin = inputted.nextLine();
//            Account customerAccount = accounts.get(Integer.parseInt(accountNumber));
//            if (customerAccount != null) {
//                if (pin.equals(customerAccount.getPin())) { // Assuming Account has a 'getPin()' method
//                    System.out.printf("Your Account Balance is %d%n", customerAccount.getBalance());
//                } else {
//                    System.out.println("Wrong pin");
//                }
//            } else {
//                System.out.println("Account not found. Please check the account number.");
//            }
//            gotoMainMenu();
//
//        }


    }

   


