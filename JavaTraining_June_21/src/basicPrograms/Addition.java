package basicPrograms;

/*
3 types of variables

1)local variable
2)instance variable
3)static variable
*/

//short cut to format your code    alt+ctrl+l
public class Addition {

    int num;//instace var declaration

    public static void main(String[] args) {

        System.out.println("accessing static variable from VariableTest class");
        System.out.println("name ="+VariableTest.name);

        //variable intialization
        int number1 = 100;
        int number2 = 50;
        System.out.println("addtion =" + (number1 + number2));
        //   System.out.println("addtion ="+number1+number2);


        System.out.println("accessing instance variable from VariableTest class");
        VariableTest variableTest=new VariableTest();
        System.out.println("instance var value=  "+variableTest.num);

    }
}
