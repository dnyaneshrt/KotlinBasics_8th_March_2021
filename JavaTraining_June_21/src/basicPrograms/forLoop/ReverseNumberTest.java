package basicPrograms.forLoop;

import java.util.Scanner;

public class ReverseNumberTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
        int num = sc.nextInt();//1234
        int sum = 0;      //sum=0

        while (num > 0) {
            int remainder = num % 10;         //1234 % 10 = 4   remainder=4,3,2,1
            sum = sum *10+remainder;       //0*10+4=4,4*10+3=43  43*10+2=432  432*10+1=4321
            num=num/10;                   //1234 / 10= 123  ,12,1,0
        }

        System.out.println("reverse of entered number ="+ sum);

    }
}
