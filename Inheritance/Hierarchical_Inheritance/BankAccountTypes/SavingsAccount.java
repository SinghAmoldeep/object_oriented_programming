
package Inheritance.Hierarchical_Inheritance.BankAccountTypes;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type : Savings Account ");
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : "+interestRate);
    }
}
