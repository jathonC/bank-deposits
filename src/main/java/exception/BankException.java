package exception;

public class BankException extends Exception {

    public BankException() {
        super();
    }

    public BankException(String message) {
        super(message);
    }

    public BankException(Exception e) {
        super(e);
    }

    public BankException(String message, Exception cause) {
        super(message, cause);
    }
}
