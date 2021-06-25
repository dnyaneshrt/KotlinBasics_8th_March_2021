package string;

import java.util.Scanner;

public class ParsingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        String num1 = sc.next();

        System.out.println("enter second number");
        String num2 = sc.next();

        int a=Integer.parseInt(num1);//String to int conversion
        int b=Integer.parseInt(num2);



        System.out.println("addition= "+(a+b));
    }
}
