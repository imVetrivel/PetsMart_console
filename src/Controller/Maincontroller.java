package Controller;

import resources.*;
import Model.login;
import Views.*;

public class Maincontroller {
   public static void begin() {

      int n = start.login();

      if (n == 1) 
      {
         Users u = start.siginin();
         u = login.signin(u);
         if (u.getRole().equals("Admin")) 
         {
            Admincontroller.admin();
         }
         else if(u.getRole().equals("Customer"))
         {
            Customercontroller.User();
         }
         else if(u.getS_role().equals("Receptionist"))
         {
            Receptionistcontroller.emp_rep();
         }
         else if(u.getS_role().equals("Stock Checker"))
         {
           StockCheckercontroller.emp_stcheck();
         }
      } 

      else if (n == 2) 
      {
         Users u = start.siginup();
         u=login.signup(u);
         if(!login.checkuser(u.getEmail()))
         {
         if(u.getRole().equals("Customer"))
         {
            customer.menu();
         }
      }

      else{
         System.out.println("User Already Exists");
      }
      }

      else if(n == 3)
      {
         return;
      }
      
      else{
         System.out.println("Enter a Valid Input");
      }
   }
}
