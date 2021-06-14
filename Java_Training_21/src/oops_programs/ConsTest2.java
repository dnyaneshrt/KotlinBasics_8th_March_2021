package oops_programs;

//can we overload constructors??? :yes

public class ConsTest2 {
    //zero paramterized construcor
    ConsTest2()
    {
        System.out.println("from zero paramterized constrcuors");
    }
    //paramterized constructor
    ConsTest2(int num1,int num2)
    {
      System.out.println(num1+"----"+num2);
    }

    ConsTest2(int num1,int num2,String name)
    {
        System.out.println(num1+"----"+num2);
    }


    public static void main(String[] args) {
        ConsTest2 obj=new ConsTest2();  //zero param constructor will be excetued
        ConsTest2 obj2=new ConsTest2(25,50); //param constr will be exceuted
    }
}
