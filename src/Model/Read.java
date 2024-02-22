package Model;

import java.sql.*;
import java.util.ArrayList;
import connections.*;
import resources.*;

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

    public static String getbreed(int id)
    {
        String breed;
        String query = "select breed from animal_details where a_id=?";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet r = pst.executeQuery();
            r.next();
             breed=r.getString(1);
             return breed;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
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
                sa.setId(rs.getInt(3));
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
            while (rs.next()) {
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

    public static ArrayList<operations> getOperation()
    {
        String query = "select * from operations";
        ArrayList<operations> o = new ArrayList<>();
        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                operations op = new operations();
                op.setOperation(rs.getString(1));
                op.setPrice(rs.getInt(2));
                op.setType(rs.getString(3));

                o.add(op);
            }


        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
        return o;
    }

    public static ArrayList<category> getpetcategory() {
        String query = "select * from category";
        ArrayList<category> c = new ArrayList<>();
        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                category s = new category();
                s.setId(rs.getInt(1));
                s.setCategory(rs.getString(2));
                s.setVarities(rs.getInt(3));

                c.add(s);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
        return c;
    }

    public static ArrayList<variety> getvariety() {
        String query = "select c.category,v.Breed,v.count,v.v_id from category as c join variety as v on c.category_id=v.category_id";
        ArrayList<variety> v = new ArrayList<>();

        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                variety va = new variety();
                va.setCategory(rs.getString(1));
                va.setBreed(rs.getString(2));
                va.setCount(rs.getInt(3));
                va.setV_id(rs.getInt(4));

                v.add(va);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

        return v;
    }

    public static ArrayList<pets> getpets() {
        String query = "select a.a_id,c.category,a.Breed,a.gender,a.age,a.price from category as c join animal_details as a on c.category_id=a.c_id";
        ArrayList<pets> p = new ArrayList<>();

        try {
            Connection con = dbCon.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                pets pet = new pets();

                pet.setA_id(rs.getInt(1));
                pet.setCategory(rs.getString(2));
                pet.setBreed(rs.getString(3));
                pet.setGender(rs.getString(4));
                pet.setA_age(rs.getInt(5));
                pet.setPrice(rs.getInt(6));

                p.add(pet);
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

        return p;
    }
}
