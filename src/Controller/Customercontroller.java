package Controller;

import java.util.ArrayList;
import Model.Read;
import Model.insert;
import Model.update;
import Views.*;
import resources.*;

public class Customercontroller {
    
    public static Users u = new Users();

   public static void Customer(Users q)
    {
        u=q;
    }
    public static void User()
    {
        int choice = customer.menu();

        if(choice == 1)
        {
            buyPet();
        }

        else if(choice == 2)
        {
            shoplog s = customer.gettrain();
            s.setId(u.getId());
            s.setName(u.getName());
            ArrayList<operations> o = Read.getOperation();
            int z = customer.gettype();
            String type="";
            if(z == 1)
            type = "Dog";
            else
            type = "Cat";
            
            for(int i=0;i<o.size();i++)
            {
                if(o.get(i).getOperation().equals("Training") && o.get(i).getType().equals(type))
                {
                    s.setPrice(o.get(i).getPrice());
                }
            }

            int q = customer.alert("Training",s.getPrice());
            if(q == 1)
            insert.insertlog(s, u);
            else if(q == 2)
            {
                User();
                return;
            }
        }

        else if(choice == 3)
        {
            shoplog s = customer.getcheck();
            s.setId(u.getId());
            s.setName(u.getName());
            ArrayList<operations> o = Read.getOperation();
            int z = customer.gettype();
            String type="";
            if(z == 1)
            type = "Dog";
            else
            type = "Cat";
            
            for(int i=0;i<o.size();i++)
            {
                if(o.get(i).getOperation().equals("HealthCheck ") && o.get(i).getType().equals(type))
                {
                    s.setPrice(o.get(i).getPrice());
                }
            }

            int q = customer.alert("HealthCheck",s.getPrice());
            if(q == 1)
            insert.insertlog(s, u);
            else if(q == 2)
            {
                User();
                return;
            }
        }
        else if(choice == 4)
        {
            ArrayList<shoplog> s = Read.getlog();
            customer.shoplogg(s, u.getId());
        }
        else if(choice == 5)
        {
            return;
        }
        User();
    }

    public static void buyPet()
    {
        ArrayList<category> c = Read.getpetcategory();
        customer.getcategory(c);

        int n = customer.disp();

        if(n == 1)
        {
            ArrayList<variety> v = Read.getvariety();
            customer.getvariety(v);

            int z = customer.disp();

            if(z == 1)
            {
               ArrayList<pets> p = Read.getpets();
               customer.getpets(p);

               int confirm = customer.confirm();

               if(confirm == 1)
               {
                   int p_id = customer.buy();
                   if(!update.check(p_id))
                   {
                       customer.invalidid();
                       User();
                       return;
                   }
                   else
                   {
                       String d=customer.getdate();
                       String breed = Read.getbreed(p_id);
                       shoplog s = update.buy(p_id,d,u.getName(),breed,"Purchased");
                       insert.insertlog(s, u);
                       update.cust_buy(p_id);
                   }
               }
               else if(confirm == 2)
               {
                   return;
               }
            }
            else if (z == 2)
            {
               return;
            }
        }
        else if(n == 2)
        {
           return;
        }
    }


}
