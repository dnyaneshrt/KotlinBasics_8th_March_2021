package oops_programs;

//this keyword at constrctor level : this()   //this
//this() is used to pass paramters to constrctors in same class
//this() always must be in first line.
//this() cannot be used in static context.

public class ThisTest3 {
    ThisTest3() {
        this("Android");//1
        System.out.println("from zero param cons");
    }
    ThisTest3(String param) {
        this("java", 555);
        System.out.println("parametrized constructor " + param);
    }
    ThisTest3(String param, int number) {
        System.out.println("parametrized constructor " + param + "---------" + number);
    }

    public static void main(String[] args) {
        new ThisTest3();//zero param const
    }
}
