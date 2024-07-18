import java.util.ArrayList;

public class Bank {
        private ArrayList<Customer> customers;
        private ArrayList<Bank_Account> accounts;

        public Bank() {
            customers = new ArrayList<>();
            accounts = new ArrayList<>();
        }

        public void addCustomer(String name, String customerId) {
            Customer customer = new Customer(name, customerId);
            customers.add(customer);
            System.out.println("Customer added: " + name);
        }

        public void createAccount(String customerId, String accountNumber) {
            Customer customer = findCustomer(customerId);
            if (customer != null) {
                Bank_Account account = new Bank_Account(accountNumber, customer);
                accounts.add(account);
                System.out.println("Account created for customer: " + customer.getName());
            } else {
                System.out.println("Customer not found");
            }
        }

        public Bank_Account getAccount(String accountNumber) {
            for (Bank_Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
            return null;
        }

        public void deposit(String accountNumber, double amount) {
            Bank_Account account = getAccount(accountNumber);
            if (account != null) {
                account.deposit(amount);
            } else {
                System.out.println("Account not found");
            }
        }

        public void withdraw(String accountNumber, double amount) {
            Bank_Account account = getAccount(accountNumber);
            if (account != null) {
                account.withdraw(amount);
            } else {
                System.out.println("Account not found");
            }
        }

        public void checkBalance(String accountNumber) {
            Bank_Account account = getAccount(accountNumber);
            if (account != null) {
                System.out.println("Balance of your account " + accountNumber + ": Rs " + account.getAccountBalance());
            } else {
                System.out.println("Account not found");
            }
        }

        public Customer findCustomer(String customerId) {
            for (Customer customer : customers) {
                if (customer.getCustomerid().equals(customerId)) {
                    return customer;
                }
            }
            return null;
        }
    }


