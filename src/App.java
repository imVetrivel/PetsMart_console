
import AdminDao.scan;
import DBcon.*;
import views.*;
import AdminDao.*;
public class App extends scan{
    public static void main(String[] args) {
        System.out.println("    --------------------------------");
        System.out.println("    ----  WELCOME TO PETS MART  ----");
        System.out.println("    --------------------------------");
        System.out.println();
        // App.loginmenu();
    }

    public static void loginmenu() {
        System.out.println("    --------------------------");
        System.out.println("    --- Enter 1 to Signin ----");
        System.out.println("    --- Enter 2 to Signup ----");
        System.out.println("    --- Enter 3 to Exit   ----");
        System.out.println("    --------------------------");
        int a = ab.nextInt();
        ab.nextLine();
        if (a == 1) {
           
        } else if (a == 2) {
           
        } else if (a == 3) {
            return;
        } else {
            System.out.println();
            System.out.println("Please Enter a Valid Input");
            System.out.println();
        }
    }
}
