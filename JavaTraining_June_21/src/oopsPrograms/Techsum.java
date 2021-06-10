package oopsPrograms;

class Student {
    int roll;//members/variables
    String name;

    //instance methods
    public void displayStudentDeatils() {
        System.out.println("roll no=" + roll + " name=" + name);
    }
}

public class Techsum {

    public static void main(String[] args) {
//new Student() actual object
        //vaishali   instance
        Student vaishali = new Student();//object creation.(instanciation)
        vaishali.roll = 101;
        vaishali.name = "vaishali";
        vaishali.displayStudentDeatils();

        Student nikhil = new Student();//object creation.(instanciation)
        nikhil.roll = 102;
        nikhil.name = "nikhil";
        nikhil.displayStudentDeatils();


        MethodTest obj = new MethodTest();
        System.out.println("addtion of two numbers from techsum class " + obj.addNumbers(50, 100));

        System.out.print("test:  " + new MethodTest().addNumbers(45, 45));

        MethodTest.info();
    }
}
