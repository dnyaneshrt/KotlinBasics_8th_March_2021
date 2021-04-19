import java.util.Scanner;

public class ThrowTest {
    //throw -it is used to throw predefined or user defined Exception
    //instead of handling exception,i am supressing
    public void payBill(int amount,int bill) throws NoMoneyException {
        if(bill>amount)
        {
            throw new NoMoneyException("money is not available sorry");
        }else if(amount==2000)
        {
            try {
                throw new ChangeNotAvailableException();
            } catch (ChangeNotAvailableException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("thaks,visit again");
        }
    }

    public static void main(String[] args) throws NoMoneyException {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the amount");
        int amount=sc.nextInt();

        System.out.println("please enter the bill");
        int bill=sc.nextInt();

        ThrowTest tt=new ThrowTest();
        tt.payBill(amount,bill);

    }
}
