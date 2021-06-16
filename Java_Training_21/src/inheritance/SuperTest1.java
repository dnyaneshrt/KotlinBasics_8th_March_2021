package inheritance;

//super keyword at variable level
class SuperParent {
    int money = 3333;

}

class SuperChild extends SuperParent {
    int money = 2222;
    public void displayInfo() {
        System.out.println("money =" + money);
        System.out.println("money for super class = " + super.money);//super keyword at variable level
    }
}

public class SuperTest1 {
    public static void main(String[] args) {
        SuperChild child = new SuperChild();
        child.displayInfo();
    }
}
