package oops_programs;

//we cannot change the value of final variables.
//final methods we cannot override.
//final class cannot have child class
class FTest
{
  //we cannot override final methods
  final void test()
    {
        System.out.println("test method from parent class");
    }
}
public class FinalTest extends FTest{

//    void test()
//    {
//        System.out.println("test method from child class");
//    }
    void finalTest()
    {
        final int a=555;
        System.out.println("value before changed "+a);
       // a=777;
//        a++;//556
//       System.out.println("value after changed "+a);

    }
    public static void main(String[] args) {
       FinalTest f=new FinalTest();
       f.finalTest();
    }
}
