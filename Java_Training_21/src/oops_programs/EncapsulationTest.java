package oops_programs;

import java.util.Scanner;

//it is mechanism of data hiding
//and user interface to access that data from other class(Admin)
//tightly encapsulated class means all members are in the class are private

class Student {
    private String username;
    private String password;
    private int marks;

    public void setMarks(int marks)
    {
       this.marks=marks;
    }
    public int getMarks()
    {
        return marks;
    }
    //setXXX  getXXX
//getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        boolean user = true;
        if (user) {
            this.username = username;
            System.out.println("username set successfully");
        } else {
            System.out.println("you don't have an authoirty to set username");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, String person) {
        String user = person;
        System.out.println(user);
        if (user.equals("rupali"))//by equual  smethod we arecomaring the two strings
        {
            this.password = password;
            System.out.println("password set sucessfully");
        } else {
            System.out.println("failed to set password");
        }

    }

    //getters setters
}

public class EncapsulationTest {
    public static void main(String[] args) {

        Student s = new Student();
        s.setUsername("nikhil_123");
        System.out.println("username=  " + s.getUsername());

        System.out.println("enter the name of person, who is gonna change the password:");
        String personname = new Scanner(System.in).next();

        s.setPassword("12345", personname.trim());//trim methods removes the spaces from left and right side
        System.out.println("password=  " + s.getPassword());

        s.setMarks(90);
        System.out.println("marks="+s.getMarks());
    }
}
