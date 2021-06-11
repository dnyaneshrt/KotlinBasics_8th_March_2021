package basicPrograms;

public class VariableTest {

    public int num = 111;  //instance variable

    public static String name = "Techsum"; //static variable

    //instance method
    public void displayInfo() {
        int num = 222;  //local varaible
        System.out.println("from displayInfo method");
        System.out.println("value of num=" + num); //
    }


    public static void main(String[] args) {
        VariableTest variableTest = new VariableTest();

        variableTest.num = 555;
        variableTest.displayInfo();//method calling.
        System.out.println("static var " + VariableTest.name);
    }
}
