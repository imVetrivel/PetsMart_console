
import AdminDao.*;
import Database.*;
import UserDao.customer;

public class App extends scan {
    public static void main(String[] args) {
        System.out.println("    --------------------------------");
        System.out.println("    ----  WELCOME TO PETS MART  ----");
        System.out.println("    --------------------------------");
        System.out.println();
        App.loginmenu();
    }

    public static void loginmenu() {
        System.out.println("    --------------------------");
        System.out.println("    --- Enter 1 to Signin ----");
        System.out.println("    --- Enter 2 to Signup ----");
        System.out.println("    --- Enter 3 to Exit   ----");
        System.out.println("    --------------------------");
        int a = ab.nextInt();
        ab.nextLine();
        if (a == 1) 
        {
            System.out.println("Enter Your Email");
            String mail = ab.nextLine();
            System.out.println("Enter Your Password");
            String pass = ab.nextLine();
            String s[] = login.signin(mail, pass);
            try 
            {
                System.out.println("Welcome " + s[1]);
                if (s[0].equals("Admin")) {
                    admin.menu();
                } else if (s[0].equals("Customer")) {
                    customer.menu(s[1], Integer.parseInt(s[2]));
                }
            } 
            catch (Exception e) {
                loginmenu();
            }
        } 
        else if (a == 2) 
        {
            System.out.println("Enter your Email");
            String mail = ab.nextLine();
            System.out.println("Enter your password");
            String pass = ab.nextLine();
            System.out.println("Enter your Name");
            String name = ab.nextLine();
            System.out.println("Enter your PhoneNumber");
            String num = ab.nextLine();
            if (login.check(mail))
            {
                System.out.println("User Already Exists");
                String s[] = login.signin(mail, pass);
                System.out.println("Welcome " + s[1]);
                if (s[0].equals("Admin")) {
                    admin.menu();
                } 
                else if (s[0].equals("Customer")) {
                    customer.menu(s[1], Integer.parseInt(s[2]));
                }
            } 
            else 
            {
                String s[] = login.signup(mail, pass, name, num);
                try {
                    System.out.println("Welcome " + s[1]);
                    customer.menu(s[1], Integer.parseInt(s[2]));
                } 
                catch (Exception e) {
                    loginmenu();
                }
            }
        } 
        else if (a == 3) {
            return;
        } 
        else {
            System.out.println();
            System.out.println("Please Enter a Valid Input");
            System.out.println();
        }
    }
}
