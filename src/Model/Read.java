package Model;

import java.sql.*;
import java.util.ArrayList;
import connections.*;
import resources.customer_details;
import resources.employee_details;
import resources.salary;
import resources.shoplog;

public class Read {

    public static ArrayList<employee_details> getempdetails() {
        ArrayList<employee_details> e = new ArrayList<employee_details>();

        String query = "select e.id,m.name,e.ph_num,e.specific_role,e.salary from employee_details as e join member_details as m on e.id=m.id";
        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                employee_details ed = new employee_details();
                ed.setId(rs.getInt(1));
                ed.setName(rs.getString(2));
                ed.setC_num(rs.getLong(3));
                ed.setSpecific_role(rs.getString(4));
                ed.setSalary(rs.getInt(5));
                e.add(ed);
            }
        } catch (Exception q) {
            System.out.println("Something went Wrong");
        }
        return e;
    }

    public static ArrayList<customer_details> getcustomer() {

        String query = "select c.id,m.name,c.ph_num from customer_details as c join member_details as m on c.id=m.id";
        ArrayList<customer_details> c = new ArrayList<>();
        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                customer_details cust = new customer_details();
                cust.setId(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setNum(rs.getLong(3));

                c.add(cust);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

        return c;
    }

    public static ArrayList<salary> getsalary() {
        String query = "select * from salary";
        ArrayList<salary> s = new ArrayList<>();
        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                salary sa = new salary();
                sa.setRole(rs.getString(1));
                sa.setSalary(rs.getInt(2));
                s.add(sa);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
        return s;
    }

    public static ArrayList<shoplog> getlog() {
        String query = "select m.id,m.name,c.date_,c.purpose,c.price,c.animalage,c.petgender from customer_history as c join member_details as m on m.id=c.id";
        ArrayList<shoplog> s = new ArrayList<>();

        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                shoplog sh = new shoplog();
                sh.setId(rs.getInt(1));
                sh.setName(rs.getString(2));
                sh.setDate(rs.getDate(3));
                sh.setPurpose(rs.getString(4));
                sh.setPrice(rs.getInt(5));
                sh.setA_age(rs.getInt(6));
                sh.setA_gender(rs.getString(7));

                s.add(sh);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

        return s;
    }
}
