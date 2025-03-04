package constructors_and_access_modifiers.level2.bank_account_management;

public class Main {
    public static void main(String[] args) {
        SavingAccount hdfc = new SavingAccount(12345, "Rishav Thakur", 50000);
        hdfc.getAccountDetails();
        hdfc.getBalance();
    }
}