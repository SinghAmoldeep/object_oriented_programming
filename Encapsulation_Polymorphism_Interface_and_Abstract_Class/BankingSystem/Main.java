package Encapsulation_Polymorphism_Interface_and_Abstract_Class.BankingSystem;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>(){{
            add(new SavingsAccount("20202", "Rishav", 90201.0));
            add(new SavingsAccount("93202", "Sahil", 2201.20));
            add(new SavingsAccount("02001", "Aman", 102983.80));
            add(new CurrentAccount("w92020", "Netan", 902900.12));
            add(new CurrentAccount("d21920", "Annand", 202900.12));
        }};

        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.calculateInterest();
            if (bankAccount.calculateLoanEligibility()){
                bankAccount.applyForLoan();
            }
        }
    }
}

