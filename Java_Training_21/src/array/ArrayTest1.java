package array;

public class ArrayTest1 {
    String[] names = new String[7];//Array declaration

    public void display() {
        names[3] = "rahul";
        names[4] = "shradha";
        names[5] = "radhika";
        names[6] = "tanaya";
        names[0] = "nikhil";
        names[1] = "vaishali";
        names[2] = "rupali";
        // names[7] = "dnyaneshwar";    .ArrayIndexOutOfBoundsException

        int count = 0;
        for (String name : names) {
            count++;
            System.out.println(count + " : " + name);
        }

        System.out.println("total number of employees are: " + names.length);//to get the size of array
        System.out.println("emplyee at third position " + names[3 - 1]);
    }


    public static void main(String[] args) {
        ArrayTest1 a = new ArrayTest1();
        a.display();
    }
}
