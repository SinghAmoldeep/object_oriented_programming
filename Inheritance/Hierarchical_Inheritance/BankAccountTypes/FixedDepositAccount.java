
package Inheritance.Hierarchical_Inheritance.BankAccountTypes;

public class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
