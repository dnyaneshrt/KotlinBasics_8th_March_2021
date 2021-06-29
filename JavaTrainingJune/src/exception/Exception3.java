package exception;

//finally block exceutes anyhow,whether exception raises or not.
public class Exception3 {
    public static void main(String[] args) {
        try {
            String name = null;//default value for the String is null
            System.out.println(name.length());//

//            System.out.println("imp code 1000 lines");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
//            System.out.println("imp code 1000 lines");

        } finally {
            System.out.println("from finally block");
            System.out.println("imp code 1000 lines");
        }
    }

}
