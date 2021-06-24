package string;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "CloudMantra";//String literal
        String s2 = "CloudMantra";
        if (s1 == s2) {
            System.out.println("both strings are same");
        } else {
            System.out.println("both Strings are  not same");
        }
        String name1 = new String("pune");//by using new keyword
        String name2 = new String("Pune");
        //was comparing references
        if (name1 == name2) {
            System.out.println("both Strings are same");
        } else {
            System.out.println("both Strings are  not same");
        }
        if (name1.equals(name2)) {
            System.out.println("both Strings are same");
        } else {
            System.out.println("both Strings are  not same");

        }
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("both Strings are same");
        } else {
            System.out.println("both Strings are  not same");
        }
    }
}
