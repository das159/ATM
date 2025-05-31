package atm;

public class User {
    private String cardNumber;
    private String pin;

    public User(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }
}
