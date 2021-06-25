package string;

public class ImmutablitiyTest {

    public static void main(String[] args) {
        String s1="java with android";
        String s2=s1.concat(" and kotlin");
        System.out.println("my String is :"+s1);//java with android
        System.out.println("my String after modify :"+s2);
    }
}
