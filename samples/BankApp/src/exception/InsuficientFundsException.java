package exception;

public class InsuficientFundsException extends Exception {
    public InsuficientFundsException() {
    }

    public InsuficientFundsException(String message) {
        super(message);
    }
}
