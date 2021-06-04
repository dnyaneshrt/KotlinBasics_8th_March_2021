package basicPrograms;

import java.util.Scanner;

public class AdditionInputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = sc.next();//getting imput

        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int result = num1 + num2;

        System.out.println("addtion=" + result);
        System.out.println("entered name was  " + name);
    }
}
