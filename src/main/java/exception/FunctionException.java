package exception;

/**
 * Неправильное объявление функции.
 */
public class FunctionException extends VisitorException {
    public FunctionException(String message) {
        super(message);
    }
}
