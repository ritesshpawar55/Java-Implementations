package exception_handling;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("Balance is negative. Cannot calculate interest.");
    }
}