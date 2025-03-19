package Inheritance.Hierarchical_Inheritance.BankAccountTypes;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }

    public void displayDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }
}