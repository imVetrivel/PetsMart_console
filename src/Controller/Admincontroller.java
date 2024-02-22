package Controller;

import Views.*;
import Model.*;
import resources.*;
import java.util.*;

public class Admincontroller {

  public static void admin() {
    int choice = admin.menu();

    if (choice == 1) {
      int n = admin.adminDisp();

      if (n == 1) 
      {
        ArrayList<employee_details> e = Read.getempdetails();
        admindisplay.e_details(e);
      } 
      else if (n == 2) 
      {
        ArrayList<salary> s = Read.getsalary();
        admindisplay.s_details(s);
      } 
      else if (n == 3) 
      {
        ArrayList<category> c = Read.getpetcategory();
        admindisplay.getcategory(c);

        int ch = admin.dispPets();

        if (ch == 1) 
        {
          ArrayList<variety> v = Read.getvariety();
          admindisplay.getvariety(v);

          int z = admin.dispPets();

          if (z == 1) {
            ArrayList<pets> p = Read.getpets();
            admindisplay.getpets(p);
          }
           else if (z == 2) 
          {
            admin();
            return;
          }
        } 
        else if (ch == 2) 
        {
            admin();
            return;
        }
      } 
      else if (n == 4) 
      {
        ArrayList<customer_details> c = Read.getcustomer();
        admindisplay.cust_details(c);
      } 
      else if (n == 5) 
      {
        ArrayList<shoplog> s = Read.getlog();
        admindisplay.shoplogg(s);
      }
      else if(n == 6)
      {
        ArrayList<operations> o = Read.getOperation();
        admindisplay.getservices(o);
      }
    }

    else if (choice == 2) 
    {
      int n = admin.adminUpdate();
      if (n == 1) 
      {
        String category = admin.getcategory();
        if(insert.checkcategory(category))
        {
          String variety = admin.getvariety();
          if(insert.checkvariety(variety))
          {
            int count = admin.countPets();
            ArrayList<pets> p = admin.getPets(count);
            for(int i=0;i<count;i++)
            {
              p.get(i).setBreed(variety);
              p.get(i).setCategory(category);
            }

            insert.addexistspets(p);
          }
        }
      } 
      else if (n == 2) 
      {
        int id = admin.geta_id();
        update.cust_buy(id);
      } 
      else if (n == 3) 
      {
        int id = admin.geta_id();
        int price = admin.newprice();
        update.cngPetPrice(id, price);
      } 
      else if (n == 4) 
      {
        int s_id = admin.gets_id();
        int price = admin.newprice();
        update.cngsalary(s_id, price);
      }
      else if(n == 5)
      {

        int z = admin.opprice();

        if(z == 1)
        {
          int w = admin.choose("Training");

          if(w == 1)
          {
            int price = admin.newprice();
            update.cngPrice("Dog", "Training", price);
          }
          else if(w == 2)
          {
            int price = admin.newprice();
            update.cngPrice("Cat", "Training", price);
          }
        }
        else if(z == 2)
        {
          int w = admin.choose("Health Check");
          
          if(w == 1)
          {
            int price = admin.newprice();
            update.cngPrice("Dog", "HealthCheck ", price);
          }
          else if(w == 2)
          {
            int price = admin.newprice();
            update.cngPrice("Cat", "HealthCheck ", price);
          }
        }
      }
    }

    else if (choice == 3) {
      return;
    }

    else {
      admin();
      return;
    }
    admin();
  }
}