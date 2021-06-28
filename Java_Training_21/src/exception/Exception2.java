package exception;

import java.util.Scanner;

//we can try-catch block inside try block
public class Exception2 {
    static int num1;
    static int num2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        num1 = sc.nextInt();

        System.out.println("enter second number");
        num2 = sc.nextInt();

        try {
            int result = num1 / num2;
        } catch (ArithmeticException ae) {
            System.out.println("infinity");
        }

        System.out.println("result= " + num1 / num2);


    }
}
