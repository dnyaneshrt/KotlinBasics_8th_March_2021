package exception;

import java.util.Scanner;

public class ThrowTest1 {
    public static void main(String[] args) {
        System.out.println("enter any number");
        int age = new Scanner(System.in).nextInt();

        //user Desfined exception
        if (age < 18) {
            try {
                throw new CannotVoteException("cannot vote");
            } catch (CannotVoteException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("yes he/she can vote");
        }
    }
}
