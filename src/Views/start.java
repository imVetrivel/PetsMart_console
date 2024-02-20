package Views;

import connections.scan;
import resources.*;

import java.util.*;   

public class start {
    
    public static int login(){
        Scanner ab = scan.getscanner();
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
        Scanner ab=scan.getscanner();
        ab.nextLine();
        Users u=new Users();
        System.out.println("Enter your email");
        String mail=ab.nextLine();
        System.out.println("Enter your password");
        String pass=ab.nextLine();
        u.setemail(mail);
        u.setpassword(pass);
        return u;
    }

    public static Users siginup()
    {
        Scanner ab=scan.getscanner();
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
        u.setemail(mail);
        u.setpassword(pass);
        u.setname(name);
        u.setc_num(c_num);
        return u;
    }
}
