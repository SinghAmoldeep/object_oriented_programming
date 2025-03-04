package java_classes_and_objects.Level_2.ATM_problem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1234567890L, 5000);
        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
    }
}