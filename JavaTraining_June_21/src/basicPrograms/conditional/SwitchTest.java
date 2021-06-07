package basicPrograms.conditional;
import java.util.Scanner;
public class SwitchTest {

    public static void main(String[] args) {

        int i=0;
        while(i<5) {

            System.out.println("count= "+(i+1));
            System.out.println("these are the list of movies:\n\n");
            System.out.println("1. bahubali");
            System.out.println("2. super30");
            System.out.println("3. radhe");
            System.out.println("4. saaho");
            System.out.println("5. kgf");

            System.out.println("choose your favourite movie:\n");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("prabhas's movie");
                    System.out.println("i want to watch bahubali");
                }
                    break;//exits from switch
                case 2:
                    System.out.println("i want to watch super30");
                    break;//exits from switch
                case 3:
                    System.out.println("i want to watch radhe");
                    break;//exits from switch
                case 4:
                    System.out.println("i want to watch saaho");
                    break;//exits from switch

                case 5:
                    System.out.println("i want to watch kgf");
                    break;//exits from switch

                default:
                    System.out.println("i am not going watch movie today:");

            }
            i++;

        }
    }
}
