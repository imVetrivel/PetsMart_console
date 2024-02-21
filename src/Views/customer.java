package Views;

import connections.*;
import resources.*;
import java.sql.Date;
import java.util.*;

public class customer {

    public static Scanner ab=scan.getscanner();

    public static int menu() 
    {
        System.out.println("Enter 1 to Buy Pets");
        System.out.println("Enter 2 to Train Your Pet");
        System.out.println("Enter 3 to Health Check Your Pet");
        System.out.println("Enter 4 to View your's History");
        System.out.println("Enter 5 to Exit");

        int n = ab.nextInt();

        return n;
    }

    public static int disp()
    {
        System.out.println("Enter 1 to Get More Informatiom");
        System.out.println("Enter 2 to go Back");

        int n = ab.nextInt();
        return n;
    }

    public static int confirm()
    {
        System.out.println("Enter 1 to confirm");
        System.out.println("Enter 2 to go Back");
         
        int n = ab.nextInt();

        return n;
    }

    public static shoplog gettrain()
    {
        shoplog s = new shoplog();
        ab.nextLine();
        System.out.println("Enter the Date in the Formate yyyy-mm-dd");
        String date = ab.nextLine();
        System.out.println("Enter your's Pet Breed");
        String breed = ab.nextLine();
        System.out.println("Enter your's Pet Gender");
        String gender = ab.nextLine();
        System.out.println("Enter your's pet Age in Months");
        int age = ab.nextInt();

        s.setA_age(age);
        s.setA_gender(gender);
        s.setDate(Date.valueOf(date));
        s.setPurpose("Training "+breed);
        
        return s;
    }

    public static shoplog getcheck()
    {
        shoplog s = new shoplog();
        ab.nextLine();
        System.out.println("Enter the Date in the Formate yyyy-mm-dd");
        String date = ab.nextLine();
        System.out.println("Enter your's Pet Breed");
        String breed = ab.nextLine();
        System.out.println("Enter your's Pet Gender");
        String gender = ab.nextLine();
        System.out.println("Enter your's pet Age in Months");
        int age = ab.nextInt();

        s.setA_age(age);
        s.setA_gender(gender);
        s.setDate(Date.valueOf(date));
        s.setPurpose("HealthCheck "+breed);
        
        return s;
    }

    public static int gettype()
    {
        System.out.println("Enter 1 to train dog");
        System.out.println("Enter 2 to train cat");

        int n = ab.nextInt();

        return n;
    }

    public static int alert(String a,int p)
    {
        System.out.println(a+" Price is "+p);
       int n=confirm();
       return n;
    }

    public static String getdate()
    {
        System.out.println("Enter the Date in the Formate yyyy-mm-dd");
        ab.nextLine();
        String d=ab.nextLine();
        return d;
    }

    public static int buy()
    {
        System.out.println("Enter Pet_id to buy a Pet");
        int id = ab.nextInt();

        return id;
    }

    public static void invalidid()
    {
        System.out.println("Enter a Valid pet id");
    }

   public static void getcategory(ArrayList<category> c) {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.printf("| %-3s |", "ID");
        System.out.printf(" %-9s |", "Category");
        System.out.printf(" %-10s |", "Varieties");
        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 0; i < c.size(); i++) {
            System.out.printf("| %-3s |", c.get(i).getId());
            System.out.printf(" %-9s |", c.get(i).getCategory());
            System.out.printf(" %-10d |", c.get(i).getVarities());
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

     public static void getvariety(ArrayList<variety> v) {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.printf("| %-9s |", "Category");
        System.out.printf(" %-16s |", "Breed");
        System.out.printf(" %-5s |", "Count");
        System.out.println();
        System.out.println("----------------------------------------");

        for (int i = 0; i < v.size(); i++) {
            System.out.printf("| %-9s |", v.get(i).getCategory());
            System.out.printf(" %-16s |", v.get(i).getBreed());
            System.out.printf(" %-5d |", v.get(i).getCount());
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

     public static void getpets(ArrayList<pets> p) {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("| %-10s |", "Animal_id");
        System.out.printf(" %-9s |", "Category");
        System.out.printf(" %-16s |", "Breed");
        System.out.printf(" %-8s |", "Gender");
        System.out.printf(" %-15s |", "Age(in months)");
        System.out.printf(" %-8s |", "Price");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        
        for (int i = 0; i < p.size(); i++) {
            System.out.printf("| %-10d |", p.get(i).getA_id());
            System.out.printf(" %-9s |", p.get(i).getCategory());
            System.out.printf(" %-16s |", p.get(i).getBreed());
            System.out.printf(" %-8s |", p.get(i).getGender());
            System.out.printf(" %-15s |", p.get(i).getA_age());
            System.out.printf(" %-8d |", p.get(i).getPrice());
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

     public static void shoplogg(ArrayList<shoplog> s,int id) {
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s |", "Id");
        System.out.printf(" %-15s |", "Name");
        System.out.printf(" %-10s |", "Date");
        System.out.printf(" %-30s |", "Purpose");
        System.out.printf(" %-8s |", "Price");
        System.out.printf(" %-10s |", "Animal Age");
        System.out.printf(" %-14s |", "Animal Gender");
        System.out.println();
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < s.size(); i++) {
            if(id == s.get(i).getId())
            {
            System.out.printf("| %-5s |", s.get(i).getId());
            System.out.printf(" %-15s |", s.get(i).getName());
            System.out.printf(" %-10s |", s.get(i).getDate());
            System.out.printf(" %-30s |", s.get(i).getPurpose());
            System.out.printf(" %-8d |", s.get(i).getPrice());
            System.out.printf(" %-10d |", s.get(i).getA_age());
            System.out.printf(" %-14s |", s.get(i).getA_gender());
            System.out.println();
            }
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
    }
}
