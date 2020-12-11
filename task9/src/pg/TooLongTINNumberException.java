package pg;

public class TooLongTINNumberException extends TINNumberException {
    public TooLongTINNumberException(String message) {
        super(message);
    }
}