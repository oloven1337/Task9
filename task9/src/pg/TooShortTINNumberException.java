package pg;

public class TooShortTINNumberException extends TINNumberException {
    public TooShortTINNumberException(String message) {
        super(message);
    }
}