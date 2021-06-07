package basicPrograms.conditional;

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {

        System.out.println("enter any number");
        int number=new Scanner(System.in).nextInt();
//< > <=  >= !    AND OR NOT   <<  >>
        if(number>5)
        {
            System.out.println("number is greater than 5");
        }else if(number==5)
        {
            System.out.println("numbr is equals to 5");
        }else
        {
            System.out.println("numbr is less than 5");
        }

    }
}
