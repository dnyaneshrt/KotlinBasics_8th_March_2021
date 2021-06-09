package basicPrograms.forLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number upto you want to get multiplication table");
        int number = scanner.nextInt();
        //outer loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= number; j++) {
                String result = String.format("%4d", i * j);
                System.out.print("  " + result);
            }
            System.out.println("");
        }
    }
}
