import java.util.InputMismatchException;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  try,catch,finally,throw,throws
        try {
            System.out.println("enter first number:");
            int num1 = sc.nextInt();

            System.out.println("enter second number:");
            int num2 = sc.nextInt();

            System.out.println("result=" + (num1 / num2));
        }
        catch(InputMismatchException name)
        {
            System.out.println("please enter only int values");
        } catch (Exception name)
        {
            //you must write alternative logic
            //  System.out.println(name.getMessage());
            System.out.println("infinity");

        }finally {
            //finally block excutes whthere eception gets or not?
            System.out.println("finally block");
        }

        System.out.println("imp code");
        System.out.println("imp code");
        System.out.println("imp code");


    }

}
