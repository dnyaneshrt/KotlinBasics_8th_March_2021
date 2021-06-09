package basicPrograms.forLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter any number");
        int num = sc.nextInt();//121
        //121,12321
        int sum = 0;
        int temp = num;

        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("it's palindrome number");
        } else {
            System.out.println("it's not palindrome number");
        }

    }
}
