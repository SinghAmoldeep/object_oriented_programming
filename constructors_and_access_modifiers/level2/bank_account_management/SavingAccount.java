package constructors_and_access_modifiers.level2.bank_account_management;

public class SavingAccount extends BankAccount {
    SavingAccount(int accountNumber, String accountHolder, int balance){
        super(accountNumber, accountHolder, balance);
    }
    public void getAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}