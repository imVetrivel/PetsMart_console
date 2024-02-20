package Controller;

import Views.*;
import Model.*;
import resources.*;
import java.util.*;

public class Admincontroller {
    
    public static void admin()
    {
       int choice = admin.menu();

       if(choice == 1)
       {
         int n=admin.adminDisp();

           if(n == 1)
           {
             ArrayList<employee_details> e = Read.getempdetails();
             admindisplay.e_details(e);
           }
           else if(n == 2)
           {
             ArrayList<salary> s = Read.getsalary();
             admindisplay.s_details(s);
           }
           else if(n == 3)
           {

           }
           else if(n == 4)
           {
              ArrayList<customer_details> c = Read.getcustomer();
              admindisplay.cust_details(c);
           }
           else if(n == 5)
           {
              ArrayList<shoplog> s = Read.getlog();
              admindisplay.shoplogg(s);
           }
       }

       else if(choice == 2)
       {
           int n = admin.adminUpdate();
           if(n == 1)
           {

           }
           else if(n == 2)
           {

           }
           else if(n == 3)
           {

           }
           else if(n == 4)
           {
  
           }
       }

    }
}

