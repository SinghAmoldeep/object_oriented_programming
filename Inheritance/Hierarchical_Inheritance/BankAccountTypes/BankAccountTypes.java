
package Inheritance.Hierarchical_Inheritance.BankAccountTypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(12345, 5000, 3.5);
        BankAccount checking = new CheckingAccount(67890, 3000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount(54321, 10000, 12);

        savings.displayAccountType();
        savings.displayDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();
    }
}
