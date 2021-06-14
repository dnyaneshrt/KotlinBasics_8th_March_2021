package oops_programs;

public class OverLoadingTest {

    void add() {
        System.out.println("from add method zero args");
    }

    void add(int num) {
        System.out.println("from add method 1 parameter " + num);
    }

    void add(String name) {
        System.out.println("from add method with String param " + name);
    }

    int add(int num1, int num2) {
     return  num1+num2;
    }


    public static void main(String[] args) {
        OverLoadingTest obj = new OverLoadingTest();
        obj.add();//1
        obj.add("android");//3
        obj.add(25);//2
        System.out.println(obj.add(15,15));

    }
}
