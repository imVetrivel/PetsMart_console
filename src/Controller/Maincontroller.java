package Controller;

import resources.*;
import Model.login;
import Views.*;

public class Maincontroller {

   public static Users u = new Users();

   public static void begin() {

      int n = start.login();

      if (n == 1) {
         sigin();
      }

      else if (n == 2) {
         signup();
      }

      else if (n == 3) {
         return;
      }

      else {
         System.out.println("Enter a Valid Input");
      }
   }

   public static void sigin() 
   {
      u = start.siginin();
      u = login.signin(u);
      if (u.getRole().equals("Admin")) {
         Admincontroller.admin();
      }
       else if (u.getRole().equals("Customer")) {
         Customercontroller.Customercontrolle(u);
         Customercontroller.User();
      } 
      else if (u.getS_role().equals("Receptionist")) {
         Receptionistcontroller.emp_rep();
      } 
      else if (u.getS_role().equals("Stock Checker")) {
         StockCheckercontroller.emp_stcheck();
      }
   }

   public static void signup() 
   {
      u = start.siginup();
      if (!login.checkuser(u.getEmail())) 
      {
         u = login.signup(u);
         if (u.getRole().equals("Customer")) {
            customer.menu();
         }
      }
      else 
      {
         System.out.println("User Already Exists");
         sigin();
      }
   }
}
