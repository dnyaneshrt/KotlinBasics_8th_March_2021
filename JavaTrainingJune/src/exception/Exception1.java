package exception;

public class Exception1 {

    public static void main(String[] args) {

        String[] seats = new String[5];//array of having 5 size

        //you can never use only try block
        //catch block excecutes only if exception raises.
        //only catch block also we can not use.
        //one try block can have multiple catch blocks(Exception class must be at the last).

        try {
            seats[0] = "nikhil";
            seats[1] = "rahul";
            seats[2] = "rupali";
            seats[3] = "shradha";
            seats[4] = "radhika";
            seats[5] = "vaushali";
        }
//        }catch(ArrayIndexOutOfBoundsException a)
//        {
//            System.out.println(a.getMessage());
//            System.out.println("1  seats are full");
//        }

        catch(NumberFormatException n)
        {
            System.out.println(n.getMessage());
            System.out.println("2 seats are full");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(" 3 seats are full");
        }

        System.out.println("the list of students as follows:\n");

        for (String name : seats) {
            System.out.println(name);
        }
    }
}
