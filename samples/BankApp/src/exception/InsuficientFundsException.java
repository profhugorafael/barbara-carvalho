package exception;

public class InsuficientFundsException extends Exception {
    public InsuficientFundsException() {
        super("insuficient funds");
    }

    public InsuficientFundsException(String message) {
        super(message);
    }
}
