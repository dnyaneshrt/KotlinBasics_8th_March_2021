package oops_programs;

public class ConsTest {

    //zero paramterized constructor
    void ConsTest() {
        System.out.println("from zero parameterized constructor");
    }


    //instance method
    public void display() {
        System.out.println("i am from display method");
    }

    public static void main(String[] args) {
        ConsTest consTest = new ConsTest();
//        consTest.display();


    }
}
