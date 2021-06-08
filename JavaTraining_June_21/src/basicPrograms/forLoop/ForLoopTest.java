package basicPrograms.forLoop;

public class ForLoopTest {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            System.out.println(i);
        }

//        for(;;)
//        {
//            System.out.println("welcome");
//        }

//        int i = 1;
//        for (; i <= 10; ) {
//            System.out.println("welcome");
//            i++;
//        }

        //for each loop
        int[] numbers = {12, 52, 47441, 41, 1, 41, 1, 41};
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
            System.out.println(num);
        }

        System.out.print("addtion of all bove numbers are: " + sum);
    }
}
