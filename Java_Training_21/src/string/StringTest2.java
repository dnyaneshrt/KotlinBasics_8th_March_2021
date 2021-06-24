package string;
//String immutability,string pool,immutable class
//String is immutable in java
//immutable means we cant't change the string once we create it.
public class StringTest2 {

    public void reveseString(String name) {
        System.out.println("from reverse function :::" + name);
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i); //115
        }

        System.out.println("after reversing the string is :\n" + rev);
    }


    public static void main(String[] args) {

        String sentence = "Android is a mobile operating system based on a modified version of the Linux kernel and other open source software.";

        System.out.println("the length of String is= " + sentence.length());

        String[] words = sentence.split(" ");
//        String[] words = sentence.split(" ",8);
        int count = 1;
        for (String word : words) {
            System.out.println(count++ + " " + word);
        }
        System.out.println("total number of words =" + words.length);

        System.out.println("char at 5th position :" + sentence.charAt(4));

        System.out.println("String in lowercase :\n\n" + sentence.toLowerCase());
        System.out.println("String in uppercase :\n\n" + sentence.toUpperCase());

        if (sentence.contains("Android")) {
            System.out.println("Android String is avaialble");
        } else {
            System.out.println("Android String is not avaiable");
        }
        StringTest2 s2 = new StringTest2();
        s2.reveseString(sentence);//passing string to function


        String test = " Dnyaneshwar  ";
        String test2=" Dnyaneshwar  ";
        System.out.println("length of dyaneshwar is :" + test.length());
        System.out.println("correct length of test string is=" + test.trim().length());//trim removes extra spaces from both sides

        System.out.println(" after concatinating two strings :"+test.concat(test2));
//        System.out.println(test.compareTo(test2));
        if(test.isEmpty())
        {
            System.out.println("my String is empty");
        }else
        {
            System.out.println("my String is not empty");
        }
        //replace ,replaceALl,substring,startswith,endsWith

       System.out.println( "string after replacing "+test.replace('D','N'));
        System.out.println(test);
    }
}
