package constructors_and_access_modifiers.level2.bank_account_management;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private int balance;
    BankAccount(int accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public void modifyBalance(int newBalance){
        balance = newBalance;
    }
}