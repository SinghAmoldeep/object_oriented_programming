package Encapsulation_Polymorphism_Interface_and_Abstract_Class.BankingSystem;


public abstract class BankAccount implements ILoanable {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public abstract void calculateInterest();
}
