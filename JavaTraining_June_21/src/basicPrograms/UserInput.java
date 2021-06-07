package basicPrograms;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n\nEnter user details:");

            //accepting string type from user
            System.out.println("Enter your name:");
            String name = scanner.next();

            System.out.println("enter your age:");
            byte age = scanner.nextByte();

            System.out.println("enter your vehicle number:");
            int v_number = scanner.nextInt();

            System.out.println("Enter your result:");
            boolean result = scanner.nextBoolean();

            //accepting char data from user
            System.out.println("Enter gender:");
            char gender = scanner.next().charAt(0);


            System.out.println("user detals are as follows:");
            System.out.println("name of user is=" + name);
            System.out.println("age of the user is=" + age);
            System.out.println("vehicle number =" + v_number);
            System.out.println("result=" + result);
            System.out.println("gender is=" + gender);
        }
    }
}
