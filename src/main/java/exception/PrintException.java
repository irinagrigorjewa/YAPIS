package exception;

/**
 * Попытка печати неправильного символа.
 */
public class PrintException extends VisitorException {
    public PrintException(String message) {
        super(message);
    }
}
