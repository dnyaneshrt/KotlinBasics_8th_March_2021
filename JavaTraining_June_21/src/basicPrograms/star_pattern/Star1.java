package basicPrograms.star_pattern;

public class Star1 {

    public static void main(String[] args) {

        //nested for loop

        int count = 0;
        //outer for loop
        for (int i = 1; i <= 5; i++) {

            //inner for loop
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.print("  *   " +j);

            }
            System.out.println("");
        }

    }
}
