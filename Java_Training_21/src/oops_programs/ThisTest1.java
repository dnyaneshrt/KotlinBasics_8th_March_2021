package oops_programs;

//this test at variable level,method level and constrctor level
//this keyword refers a current class object
//this keyword we cannot use inside the static context(static method or block)
public class ThisTest1 {
    //instance variable
    String name = "java";


    public void info() { //local variable
        String name = "kotlin";
        System.out.println("name =" + name);
        System.out.println("name =" + this.name);//this at variavble level
    }

    public static void main(String[] args) {
        ThisTest1 t1 = new ThisTest1();
        t1.info();

    }
}
