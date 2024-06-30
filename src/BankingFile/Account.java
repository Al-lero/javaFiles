package BankingFile;

public class Account {
    private int balance;
    private final String pin;
    private final int accountNumber;
    private String accountName;

    public Account(String firstName, String lastName, int balance, String pin, int accountNumber) {
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public Account(String firstName, String lastName, String pin, int balance,int accountNumber) {
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.accountName = firstName + " " + lastName;

    }

    public static int generateAccountNumber() {
        return 0;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Try A Valid Amount");
        }
    }

    public void withdraw(int amount, String pin) {
        if(this.pin.equals(pin)){
            if(balance >= amount){
                balance -= amount;
            }else {
                System.out.println("Insufficient Amount");
            }
        }else {
            System.out.println("Wrong Pin");
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int checkBalance(String customerAccountNumber) {
        if(Integer.parseInt(customerAccountNumber) == this.accountNumber){
            return balance;
        }
        return 0;
    }

    int balance(){
        return balance;
    }
    String pin(){
        return pin;
    }


    public String getPin() {
        return pin;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
















