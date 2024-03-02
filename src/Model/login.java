package Model;

import java.sql.*;

import Controller.Maincontroller;
import connections.*;
import resources.*;

public class login {
   
    
    public static Users signin(Users user) {
        try {
            String query = "select * from member_details where email = ? and password = ?";
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getEmail());
            pst.setString(2, user.getPassword());
            ResultSet r = pst.executeQuery();
            r.next();

            Users m = new Users();
            m.setId(r.getInt(1));
            m.setName(r.getString(2));
            m.setEmail(user.getEmail());
            m.setPassword(user.getPassword());
            m.setRole(r.getString(5));

            if (m.getRole().equals("Employee")) 
            {
                String q = "select specific_role from employee_datails where id=?";
                PreparedStatement p = con.prepareStatement(q);
                p.setInt(1, m.getId());
                ResultSet r1 = p.executeQuery();
                r1.next();
                m.setS_role(r1.getString(1));
            }
            return m;
        } 
        catch (Exception e) {
            System.out.println("User Not Found");
             Maincontroller.begin();
            return null;
        }
    }

    public static boolean checkuser(String mail) {
        String query = "SELECT EXISTS(SELECT * from member_details WHERE email=?)";
        try 
        {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, mail);
            ResultSet r = pst.executeQuery();
            r.next();
            int z = r.getInt(1);
            if (z > 0) {
                return true;
            } else {
                return false;
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static Users signup(Users u) {
        String query = "Insert into member_details (name,email,password,role)values(?,?,?,?)";
        String q1 = "select id from member_details where email =? and password =?";
        String query1 = "Insert into customer_details values(?,?)";
        Users m = new Users();
        try 
        {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, u.getName());
            pst.setString(2, u.getEmail());
            pst.setString(3, u.getPassword());
            pst.setString(4, "Customer");
            pst.executeUpdate();
            
            PreparedStatement p = con.prepareStatement(q1);
            p.setString(1, u.getEmail());
            p.setString(2, u.getPassword());
            ResultSet r = p.executeQuery();
            r.next();

            m.setId(r.getInt(1));
            m.setEmail(u.getEmail());
            m.setC_num(u.getC_num());
            m.setName(u.getName());
            m.setPassword(u.getPassword());
            m.setRole("Customer");

            PreparedStatement p1=con.prepareStatement(query1);
            p1.setInt(1, m.getId());
            p1.setLong(2, m.getC_num());
            p1.executeUpdate();
            return m;
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }
}
