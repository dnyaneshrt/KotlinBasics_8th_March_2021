package abstraction;

/*
-abstract class: class which is created by abstract keyword
-abstract methods: the methods which does not have body.
-we can have abstract methods only if that class is abstract.
-we cannot create object of abstract class.(cannot be instantiated)
-child classes of abstract class are responsible to provide the implementation to all abtract methods

upcasting in java:
holding child class object into parent class ref is called as upcasting.
Parent p=new Child();

-Samsung is child class here.
Mobile m=new Samsung();

Annonymous inner class:
the class which does not have name is called as annonymous inner class.
 */
abstract class Mobile {
    abstract void repair();

    static {
        System.out.println("Nikhil mobile shopee");
    }
}

class Samsung extends Mobile {
    @Override
    void repair() {
        System.out.println("Samsung mobile");
    }
}

class Oppo extends Mobile {

    @Override
    void repair() {
        System.out.println("oppo mobile");
    }
}

class Iphone extends Mobile {

    @Override
    void repair() {
        System.out.println("Iphone mobile");
    }
}


public class RepairShop {
    //this method expects input paramter as abstract class(Mobile)
    public void repairMobile(Mobile mobile) {
        mobile.repair();
    }

    public static void main(String[] args) {
        RepairShop r = new RepairShop();
        r.repairMobile(new Samsung());
        r.repairMobile(new Oppo());
        r.repairMobile(new Iphone());

        Mobile onePlus = new Mobile() {
            //Annonymous inner class
            @Override
            void repair() {
                System.out.println("one plus mobile");

            }
        };
        onePlus.repair();
    }
}


