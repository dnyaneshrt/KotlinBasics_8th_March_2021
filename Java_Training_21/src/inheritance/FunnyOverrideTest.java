package inheritance;

//Super class
class RahulParent {
    void property() {
        System.out.println("lands,car,bank balance");
    }
    void marriage() {
        System.out.println(" parents suggestion : pushpanjalilaksmi or kamalabai");
    }
}

//sub class
class Rahul extends RahulParent {
    void marriage() {
        System.out.println("rahul's choice:  aishwarya or katrina");
    }
}
public class FunnyOverrideTest {
    public static void main(String[] args) {
        Rahul r = new Rahul();
        r.property();
        r.marriage();
    }
}

//final methods we cannot override in java.

