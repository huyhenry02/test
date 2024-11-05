import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    Scanner scanner = new Scanner(System.in);
    
    public Account(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public Account() {
    
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(balance);
        return accountNumber + "-" + accountName + "-" + str1;
    }
    
    public void rechargeMoney(double amount) {
        if (amount >= 0) {
            balance += amount;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(balance);
            System.out.println("You recharged " + str1 + " in your account");
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public void withdrawMoney(double amount) {
        if (amount >= 0) {
            balance -= amount;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(balance);
            System.out.println("You withdrawn " + str1 + " in your account");
        } else {
            System.out.print("Insufficient funds");
        }
    }
    
    public void maturity(double interestRate) {
        if (interestRate >= 0) {
            balance = balance + balance * interestRate;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(balance);
            System.out.println("You maturity" + str1 + "in your account");
        } else {
            System.out.print("Insufficient funds");
        }
    }
    
    void printAccount() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(balance);
        System.out.printf("%-10d %-20s %-20s \n", accountNumber, accountName, str1);
    }
}
