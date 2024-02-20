package Views;

import connections.scan;
import resources.*;

import java.util.*;   

public class start {
    
    public static Scanner ab = scan.getscanner();

    public static int login(){
        System.out.println("--------------------------");
        System.out.println("--- Enter 1 to Signin ----");
        System.out.println("--- Enter 2 to Signup ----");
        System.out.println("--- Enter 3 to Exit   ----");
        System.out.println("--------------------------");
        int n = ab.nextInt();
        return n;
    }

    public static Users siginin()
    {
        Users u=new Users();
        ab.nextLine();
        System.out.println("Enter your email");
        String mail=ab.nextLine();
        System.out.println("Enter your password");
        String pass=ab.nextLine();
        u.setEmail(mail);
        u.setPassword(pass);
        return u;
    }

    public static Users siginup()
    {
        Users u =new Users();
        ab.nextLine();
        System.out.println("Enter your email");
        String mail=ab.nextLine();
        System.out.println("Enter your password");
        String pass=ab.nextLine();
        System.out.println("Enter your Name");
        String name=ab.nextLine();
        System.out.println("Enter your Contact Number");
        long c_num=ab.nextLong();
        u.setEmail(mail);
        u.setPassword(pass);
        u.setName(name);
        u.setC_num(c_num);
        return u;
    }
}
