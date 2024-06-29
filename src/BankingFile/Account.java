package BankingFile;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String accountName;

    public Account(String firstName, String lastName, int balance, String pin, int accountNumber) {
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Account(String firstName, String lastName, String pin, int balance,int accountNumber) {

    }

    public Account(String firstName, String lastName, String pin) {
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
        return accountNumber;
    }

    public int checkBalance(String customerAccountNumber) {
        if(Integer.parseInt(customerAccountNumber) == accountNumber){
            return balance;
        }
        return 0;
    }

    public String getAccountName() {
        return accountName;
    }

    int balance(){
        return balance;
    }
    String pin(){
        return pin;
    }



}















