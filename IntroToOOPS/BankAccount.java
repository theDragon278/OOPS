package IntroToOOPS;

import java.util.*;

class BankAccountDetails {
    private String accountNumber;
    private double balance;

    BankAccountDetails(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Amount!!");
        else
            this.balance -= amount;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccountDetails account = new BankAccountDetails(accountNumber, balance);

        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        account.displayDetails();

        sc.close();
    }
}
