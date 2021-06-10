package basicPrograms;

import oopsPrograms.MethodTest;

public class IfTest {
    public  static void main(String[] args) {
        System.out.println("\n\n static method call from diff package  \n\n");
        MethodTest.info();

        int year=20;
        if(year>18)
        {
            System.out.println("you can drive");
        }else
        {
            System.out.println("you cannot drive");
        }
    }
}
