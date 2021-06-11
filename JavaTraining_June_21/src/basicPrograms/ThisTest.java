package basicPrograms;

//this keyword in java
//this()
//this keyword at variable level
//this keyword at method level
public class ThisTest {

    int num = 777; //instance variable

    public void test() {
        System.out.println("test for this ");
    }

    public void display() {
        int num = 999;  //local variable
        System.out.println("value of num= " + num); //999 local priority
        //this keyword at variable level
        System.out.println("value of num= " + this.num);//777

        System.out.println("test method call");

        //this keyword at method level
        this.test(); //we can call to antaher instance method by using this keyword
    }

    public static void main(String[] args) {
        ThisTest t1 = new ThisTest();  //object creation
        t1.display();//method calling
    }
}
