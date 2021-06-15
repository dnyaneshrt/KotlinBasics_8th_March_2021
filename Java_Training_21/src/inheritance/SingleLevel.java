package inheritance;

class Parent
{
    public void property()
    {
        System.out.println("car ,money ,bank balance");
    }
}
class Child extends Parent
{
    public  void info()
    {
        System.out.println("this is from child method");
    }
}
class GrandChild extends  Child
{
    public void gchildInfo()
    {
        System.out.println("from grand-  child class");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
     GrandChild gc=new GrandChild();
     gc.property();
     gc.info();
     gc.gchildInfo();
    }
}
