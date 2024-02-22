package Views;

import java.util.*;
import connections.*;
import resources.pets;

public class admin  {

    public static Scanner ab=scan.getscanner();

    public static int menu() {

        System.out.println("Enter 1 to Display Details");
        System.out.println("Enter 2 to Update Details");
        System.out.println("Enter 3 to Exit");
        int n = ab.nextInt();

        return n;
    }

    public static int adminDisp()
    {
        System.out.println("Enter 1 to View Employee Details");
        System.out.println("Enter 2 to View Salary Details");
        System.out.println("Enter 3 to View Pets Details");
        System.out.println("Enter 4 to View Customer Details");
        System.out.println("Enter 5 to View Shop's Log");
        System.out.println("Enter 6 to View the services");

        int n = ab.nextInt();

        return n;
    }

    public static int adminUpdate()
    {
        System.out.println("Enter 1 to Add new Pet");
        System.out.println("Enter 2 to Delete a Pet");
        System.out.println("Enter 3 to Update Price of Pet");
        System.out.println("Enter 4 to Update Salary of Employee");
        System.out.println("Enter 5 to Update Training or HealthCheck Price");

        int n = ab.nextInt();

        return n;
    }

    public static int dispPets()
    {
        System.out.println("Enter 1 to View more");
        System.out.println("Enter 2 to Back");

        int n = ab.nextInt();
        return n;
    }

    public static int opprice()
    {
        System.out.println("Enter 1 to change Training Price");
        System.out.println("Enter 2 to change HealthCheck Price");
        int n = ab.nextInt();

        return n;
    }

    public static int gets_id()
    {
        System.out.println("Enter S_id to Update the Salary");
        int id = ab.nextInt();

        return id;
    }

    public static int geta_id()
    {
        System.out.println("Enter A_id to Update the Salary");
        int id = ab.nextInt();

        return id;
    }

    public static String getcategory()
    {
        System.out.println("Enter category to insert new Pets");
        ab.nextLine();
        String category = ab.nextLine();
        
        return category;
    }
    
    public static String getvariety()
    {
        System.out.println("Enter breed to insert new Pets");
        String variety = ab.nextLine();

        return variety;
    }

    public static int countPets()
    {
        System.out.println("Enter Number of Pets to Add");
        int n = ab.nextInt();

        return n;
    }

    public static ArrayList<pets> getPets(int n)
    {
        ArrayList<pets> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            pets p = new pets();
            ab.nextLine();
            System.out.println("Enter Gender of the Pet");
            p.setGender(ab.nextLine());
            System.out.println("Enter the Age of the Pet in Months");
            p.setA_age(ab.nextInt());
            System.out.println("Enter the Price of the Pet");
            p.setPrice(ab.nextInt());
            a.add(p);
        }
        return a;
    }

    public static int choose(String type)
    {
        System.out.println("Enter 1 to Dog's "+type+" Price");
        System.out.println("Enter 2 to Cat's "+type+" Price");

        int n = ab.nextInt();

        return n;
    }

    public static int newprice()
    {
        System.out.println("Enter a New Price");

        int price = ab.nextInt();

        return price;
    }
}
