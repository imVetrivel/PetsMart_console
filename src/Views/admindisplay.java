package Views;

import resources.*;
import java.util.*;

public class admindisplay {

    public static void e_details(ArrayList<employee_details> e) {

        System.out.println("-----------------------------------------------------------");
        System.out.printf("| %-3s |", "ID");
        System.out.printf(" %-8s |", "Name");
        System.out.printf(" %-12s |", "Phone Number");
        System.out.printf(" %-14s |", "Specific Role");
        System.out.printf(" %-6s |", "Salary");
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < e.size(); i++) {
            System.out.printf("| %3d |", e.get(i).getId());
            System.out.printf(" %-8s |", e.get(i).getName());
            System.out.printf(" %12d |", e.get(i).getC_num());
            System.out.printf(" %-14s |", e.get(i).getSpecific_role());
            System.out.printf(" %-6s |", e.get(i).getSalary());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
    }

    public static void s_details(ArrayList<salary> s) {
        System.out.println();
        System.out.println("-----------------------------");
        System.out.printf("| %-15s |", "Role");
        System.out.printf(" %-7s |", "Salary");
        System.out.println();
        System.out.println("-----------------------------");
        for (int i = 0; i < s.size(); i++) {
            System.out.printf("| %-15s |", s.get(i).getRole());
            System.out.printf(" %-7d |", s.get(i).getSalary());
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    public static void cust_details(ArrayList<customer_details> c) {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.printf("| %-3s |", "ID");
        System.out.printf(" %-8s |", "Name");
        System.out.printf(" %-12s |", "Phone Number");
        System.out.println();
        System.out.println("---------------------------------");
        for (int i = 0; i < c.size(); i++) {
            System.out.printf("| %-3s |", c.get(i).getId());
            System.out.printf(" %-8s |", c.get(i).getName());
            System.out.printf(" %-12d |", c.get(i).getNum());
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public static void shoplogg(ArrayList<shoplog> s) {
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
            System.out.printf("| %-5s |", s.get(i).getId());
            System.out.printf(" %-15s |", s.get(i).getName());
            System.out.printf(" %-10s |", s.get(i).getDate());
            System.out.printf(" %-30s |", s.get(i).getPurpose());
            System.out.printf(" %-8d |", s.get(i).getPrice());
            System.out.printf(" %-10d |", s.get(i).getA_age());
            System.out.printf(" %-14s |", s.get(i).getA_gender());
            System.out.println();
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
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
}
