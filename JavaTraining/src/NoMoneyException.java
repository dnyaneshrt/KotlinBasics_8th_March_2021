public class NoMoneyException extends Exception{

    public NoMoneyException(String money_is_not_available_sorry) {
        super(money_is_not_available_sorry);
    }
}
