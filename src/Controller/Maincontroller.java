package Controller;

import resources.*;
import Model.login;
import Views.*;

public class Maincontroller {
   public static void being() {

      int n = start.login();

      if (n == 1) 
      {
         Users u = start.siginin();
         u = login.signin(u);
         if (u.getrole().equals("Admin")) 
         {
            admin.menu();
         }
         else if(u.getrole().equals("Customer"))
         {
            customer.menu();
         }
         else if(u.gets_role().equals("Receptionist"))
         {
            Receptionist.menu();
         }
         else if(u.gets_role().equals("Stock Checker"))
         {
            Stockchecker.menu();
         }
      } 
      else if (n == 2) 
      {
         Users u = start.siginup();
         u=login.signup(u);
         if(!login.checkuser(u.getemail()))
         {
         if(u.getrole().equals("Customer"))
         {
            customer.menu();
         }
      }
      else{
         System.out.println("User Already Exists");
      }
      }
   }
}
