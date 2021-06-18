package inheritance;

//can we overload the constrctor?? yes
//can we override constractor?   no
//multilevel inheritance
//super() is used to call parent class construtcor
//we pass parameters to parent class constrtocr with super()
//super() we caanot write into static context.
//super() must be at first line inside constrtcor.
//this() must be in same line inside the constructor

//can we use this() and super() together inside same constructor??  no

class A {
    A(int num) {
        super();
        System.out.println(" constrctor from A class"+num);
    }
}

class B extends A {
    B(String name) {
        super(5);
        System.out.println(" constrctor from B class"+name);
    }
}

class C extends B {
    C() {
        super("dnyaneshwar");
        System.out.println(" constrctor from C class");
    }
}

public class SuperAtCons {
    protected int pass=1234;//protected variables only accessible in child classes anywhere
    public static void main(String[] args) {

        C  c=new C();
    }
}

//A  B  C
//constructor will be excuted from parent to child classes in case of inheitance
