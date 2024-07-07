package tdd;

//import BankingFile.Account;
//import BankingFile.Bank;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//public class BankTest {
//    private Bank bank;
//    private Account currentCustomer;
//
//
//    @Test
//    public void testAddAccount(){
//        Account account = new Account("Alero","Yione","1243",0,12345);
//        bank.addAccount(account);
//        ArrayList<Account> accounts = new java.util.ArrayList<>();
//        assertEquals(1, accounts.size());
//        assertEquals(account, accounts.get(0));
//    }
//
//    @Test
//    public void testIfAccountNumbersAreGenerated(){
//        int generateNumber = Account.generateAccountNumber();
//
//        assertTrue(generateNumber >= 0 && generateNumber < 1_000_000_000);
//    }
//
//    @Test
//    public void testDepositIsAdded(){
//        int amountDeposit = 100;
//        int initialBalance = 0;
//        currentCustomer.getBalance();
//
//        currentCustomer.deposit(amountDeposit);
//        assertEquals(initialBalance + amountDeposit, currentCustomer.getBalance());
//
//    }
//
//    @Test
//    public void testIfBalanceForValidAccount(){
//        int accountNumber = 12345;
//        int expectedBalance = 100;
//
//        int actualBalance = currentCustomer.checkBalance(accountNumber,"Alero");
//        assertEquals(0,actualBalance);
//    }
//}
