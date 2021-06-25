package string;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        System.out.println("enter any name");
        String name = new Scanner(System.in).next();

        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        if (rev.equals(name)) {
            System.out.println("it's palindrome");
        } else {
            System.out.println("it's not palindrome");
        }

    }
}
