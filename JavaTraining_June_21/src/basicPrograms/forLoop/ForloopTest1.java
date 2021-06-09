package basicPrograms.forLoop;

public class ForloopTest1 {
    public static void main(String[] args) throws InterruptedException {
           //i++ i=i+1
        for(int i=1;i<=100;i++)
        {
            Thread.sleep(50);
           System.out.println("number= "+i);
        }

        System.out.println("remaining code");
    }
}
