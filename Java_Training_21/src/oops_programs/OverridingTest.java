package oops_programs;


import inheritance.SuperAtCons;

//super is also used to call parent class instance methods
//method signature must be same in case of overriding
class OppoA3
{
    void camera()
    {
        System.out.println("8mp camera");
    }
    void sound()
    {
        System.out.println("oppo a3 has good sound quality");
    }
}
class OppoA9 extends OppoA3
{
    void camera()
    {
        System.out.println("16mp camera");
    }
    void test()
    {
        System.out.println("calling from test \n");
        super.camera();//super is also used to call parent class instance methods
    }
}
public class OverridingTest extends SuperAtCons {
    public static  void main(String[] args) {
        OppoA9 obj=new OppoA9();
        obj.camera();//
        obj.sound();
        obj.test();

        System.out.println("\n\n");

        OverridingTest ot=new OverridingTest();
        System.out.println("protected variable"+ot.pass);
    }
}
