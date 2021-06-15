package inheritance;
class RbiBank
{
    int amount=55555;
    public  void rbiRules()
    {
        System.out.println("from rbi rules for bank");
    }
}
class Axis extends RbiBank
{
    Axis()
    {
        System.out.println("from Axis bank");
    }
}
class Sbi extends RbiBank
{
    Sbi()
    {
        System.out.println("from sbi bank");
    }

}


public class HirrachicalTest {
    public static void main(String[] args) {

       Sbi sbi= new Sbi();
       sbi.rbiRules();
       System.out.println(sbi.amount);

        new Axis().rbiRules();
    }
}
