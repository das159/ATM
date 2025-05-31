package atm;

public class ATMMain {
    public static void main(String[] args) {
        // Create a user and account
        User user = new User("1234567890", "1234");
        BankAccount account = new BankAccount(1000.0);

        // Start the ATM system
        ATM atm = new ATM(user, account);
        atm.start();
    }
}
