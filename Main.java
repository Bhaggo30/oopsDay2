package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        boolean pass = false;

        while (!pass) {
            System.out.println("Enter 1 for adding customer");
            System.out.println("Enter 2 to create Account");
            System.out.println("Enter 3 to deposit");
            System.out.println("Enter 4 to withdraw");
            System.out.println("Enter 5 to check balance");
            System.out.println("Enter 6 to exit");
            System.out.println("Choose an option:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter customer name:");
                    String name = sc.nextLine();
                    System.out.println("Enter customer ID:");
                    String id = sc.nextLine();
                    bank.addCustomer(name, id);
                    break;

                case 2:
                    System.out.println("Enter customer ID:");
                    String customerId = sc.nextLine();
                    if (bank.findCustomer(customerId) == null) {
                        System.out.println("Customer ID not found. Please add customer first.");
                        break;
                    }
                    System.out.println("Enter account number:");
                    String accountNumber = sc.nextLine();
                    bank.createAccount(customerId, accountNumber);
                    break;

                case 3:
                    System.out.println("Enter account number:");
                    String depositAccountNumber = sc.nextLine();
                    if (bank.getAccount(depositAccountNumber) == null) {
                        System.out.println("Account number not found.");
                        break;
                    }
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAccountNumber, depositAmount);
                    break;

                case 4:
                    System.out.println("Enter account number:");
                    String withdrawAccountNumber = sc.nextLine();
                    if (bank.getAccount(withdrawAccountNumber) == null) {
                        System.out.println("Account number not found.");
                        break;
                    }
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;

                case 5:
                    System.out.println("Enter account number:");
                    String balanceAccountNumber = sc.nextLine();
                    bank.checkBalance(balanceAccountNumber);
                    break;

                case 6:
                    pass = true;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}
