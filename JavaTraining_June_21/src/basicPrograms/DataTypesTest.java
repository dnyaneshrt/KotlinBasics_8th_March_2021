package basicPrograms;

import java.util.Scanner;

public class DataTypesTest {

    public static void main(String[] args) {

        System.out.println("integer data type info");
        System.out.println("range of integer= "+Integer.MAX_VALUE);
        System.out.println("range of integer= "+Integer.MIN_VALUE);
        System.out.println("intger requires "+Integer.BYTES+" bytes of memory");

        System.out.println("enter first number");
        int number1=new Scanner(System.in).nextInt();

        System.out.println("enter second number");
        int number2=new Scanner(System.in).nextInt();

        System.out.println("max number betwwen these 2 nubers are "+Integer.max(number1,number2));
    }
}
