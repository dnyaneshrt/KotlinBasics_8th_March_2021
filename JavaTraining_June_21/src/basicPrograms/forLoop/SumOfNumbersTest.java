package basicPrograms.forLoop;

import java.util.Scanner;

public class SumOfNumbersTest {

    public static void main(String[] args) {
        // 1 to 10 =55
        int sum=0;
//        for(int i=1;i<=10;i++)
//        {
//            sum=sum+i;
//      }

      //  System.out.println("addition from 1 to 10 ="+sum);

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter any number");
        int number=scanner.nextInt();

//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(number+"*"+i+"="+number*i);
//        }
        int i=1;
        while(i<=10)
        {
            System.out.println(number+"*"+i+"="+number*i);
            i++;
        }

    }
}
