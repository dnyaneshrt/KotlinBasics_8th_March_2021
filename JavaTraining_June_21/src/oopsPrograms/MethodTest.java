package oopsPrograms;
import java.util.Scanner;
public class MethodTest {

    //instance method
    public int addNumbers(int num1, int num2) {
        return num1+num2;
    }
    //static method
    public static void info()
    {
        System.out.println("from static info");
    }
    void display()
    {
        System.out.println("from display method");
        //1000 lines of code
    }

    public static void main(String[] args) {
        MethodTest obj = new MethodTest();//instaciation   (object creation)


        int result1 = obj.addNumbers(5, 52);  //method calling
        System.out.println("addition of two number are=" + result1);
        int result2 = obj.addNumbers(10, 52);  //method calling
        System.out.println("addition of two number are=" + result2);

        obj.display();
        obj.display();
        MethodTest.info();

    }
}
