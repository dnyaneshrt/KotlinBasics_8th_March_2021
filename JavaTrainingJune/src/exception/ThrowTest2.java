package exception;

import java.util.Scanner;

//thorws keyword is used to declare the exceptions

public class ThrowTest2 {
    void payBill(int bill, int cash) throws NoMoneyException, ChangeNotException {
        if (bill > cash) {
            throw new NoMoneyException();

        } else if (bill == 2000) {
            throw new ChangeNotException();
        } else {
            System.out.println("thanks visit again");
        }
    }

    public static void main(String[] args) throws NoMoneyException, ChangeNotException {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your bill amount?");
        int bill = sc.nextInt();

        System.out.println("enter how much cash you have?");
        int cash = sc.nextInt();

        ThrowTest2 t2 = new ThrowTest2();
        t2.payBill(bill, cash);

    }
}
