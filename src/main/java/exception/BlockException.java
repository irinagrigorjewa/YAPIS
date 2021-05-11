package exception;

/**
 * Несовпадение фактического и заявленного возвращаемых значений.
 */
public class BlockException extends VisitorException {
    public BlockException(String message) {
        super(message);
    }
}
