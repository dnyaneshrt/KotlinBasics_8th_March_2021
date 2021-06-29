package exception;

public class CannotVoteException extends Exception{

    public CannotVoteException(String cannot_vote) {
        super(cannot_vote);//super() is used to pass param to parent class constructor
    }
}
