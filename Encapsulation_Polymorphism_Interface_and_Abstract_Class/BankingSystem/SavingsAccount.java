package Encapsulation_Polymorphism_Interface_and_Abstract_Class.BankingSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = 0;
    }

    @Override
    public void calculateInterest() {
        this.interestRate = this.balance * 0.08;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan Applied for Savings Account No. " + this.accountNumber);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return this.balance >= 50000.0;
    }
}