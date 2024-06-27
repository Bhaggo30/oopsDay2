import java.util.Scanner;

interface Interface_Bank {

    void deposit(int amounbt);
    void withdraw(int amount);
    void checkBalance();
}

class Bank_Implementation implements Interface_Bank{
    int balance = 5000;

    @Override
    public void deposit(int amount) {
        System.out.println("depositing the amount "+amount);
        balance = balance+amount;
        System.out.println("amount deposit successfully");

    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw the amount");
        balance = balance-amount;
        System.out.println("amount withdraw successfully");

    }

    @Override
    public void checkBalance() {
        System.out.println("avaliable balance"+balance);

    }
}
class Customers{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Interface_Bank bank = new Bank_Implementation();
        System.out.println("1: deposit amount \n2: withdraw amount \n 3:check balance \n enter choice");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                bank.checkBalance();
                System.out.println("enter amount to be deposited");
                int amount_deposit =scanner.nextInt();
                bank.deposit(amount_deposit);
                bank.checkBalance();
                break;
            case 2:
                bank.checkBalance();
                System.out.println("enter amount to be withdraw");
                int amount_to_withdraw = scanner.nextInt();
                bank.withdraw(amount_to_withdraw);
                bank.checkBalance();
                break;
            case 3:
                bank.checkBalance();
                break;
            default:
                System.out.println("invalid choice");
        }
        System.out.println("invalid choice");
        System.out.println();
    }

}
