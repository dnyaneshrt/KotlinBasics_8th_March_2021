package exception;

public class NoMoneyException extends Exception{
    NoMoneyException()
    {
        super("cash not available");
    }
}
