package oops_programs;

//this keyword at method level

public class ThisTest2 {

    public void demo() {
//        this.info();//this keyword is optional here
        info();
        System.out.println("from demo method");
    }

    public void info() {
        display();
        System.out.println("from info method");
    }
    public void display() {
        System.out.println("from display method");
    }

    public static void main(String[] args) {
        ThisTest2 t1 = new ThisTest2();
        t1.demo();
    }
}
