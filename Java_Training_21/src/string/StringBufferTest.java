package string;

//stringBuffer is mutable
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("android");
        StringBuffer s2 = new StringBuffer(" kotlin");
        s1.append(s2);
        System.out.println("-->" + s1);
        System.out.println("->" + s1.reverse());

    }
}
