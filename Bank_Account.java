package com.bridgelabz;

public class Bank_Account {
    private String accountNumber;
    private double balance;
    private Customer customer;

    public Bank_Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit => " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw => " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
