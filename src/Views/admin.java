package Views;

import java.util.*;
import connections.*;

public class admin  {

    public static Scanner ab=scan.getscanner();

    public static int menu() {

        System.out.println("Enter 1 to Display Details");
        System.out.println("Enter 2 to Update Details");
        int n = ab.nextInt();

        return n;
    }

    public static int adminDisp()
    {
        System.out.println("Enter 1 to View Employee Details");
        System.out.println("Enter 2 to View Salary Details");
        System.out.println("Enter 3 to View Pets Details");
        System.out.println("Enter 4 to View Customer Details");
        System.out.println("Enter 5 to View Shop's Log");

        int n = ab.nextInt();

        return n;
    }

    public static int adminUpdate()
    {
        System.out.println("Enter 1 to Add new Pet");
        System.out.println("Enter 2 to Delete a Pet");
        System.out.println("Enter 3 to Update Price of Pet");
        System.out.println("Enter 4 to Update Salary of Employee");

        int n = ab.nextInt();

        return n;
    }
}
