package Views;

import java.util.*;

import connections.scan;

public class admin  {
    public static void menu() {
        Scanner ab=scan.getscanner();
        System.out.println("-------------------------------------------------");
        System.out.println("---- Press 1 to View The Employee Details  ------");
        System.out.println("---- Press 2 to View The Customer Details  ------");
        System.out.println("---- Press 3 to View The Customer History  ------");
        System.out.println("---- Press 4 to View The Pets Category     ------");
        System.out.println("---- Press 5 to View The Salary Details    ------");
        System.out.println("---- Press 6 to Exit                       ------");
        System.out.println("-------------------------------------------------");
        int a = ab.nextInt();
        if(a==1)
        {
           
        }
        else if(a==2)
        {
            
        }
        else if(a==3)
        {
           
        }
        else if(a==4)
        {
           
        }
        else if(a==5)
        {
           
        }
        else if(a==6)
        {
            return;
        }
        else
        {
            System.out.println();
            System.out.println("Please Enter a Valid Number");
            System.out.println();
        }
    }
}
