package Model;

import java.sql.*;
import Views.*;
import connections.*;
import resources.*;

public class login {
    public static Users signin(Users user) {
        try {
            String query = "select * from member_details where email = ? and password = ?";
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getemail());
            pst.setString(2, user.getpassword());
            ResultSet r = pst.executeQuery();
            r.next();

            Users m = new Users();
            m.setid(r.getInt(1));
            m.setname(r.getString(2));
            m.setemail(user.getemail());
            m.setpassword(user.getpassword());
            m.setrole(r.getString(5));

            if (m.getrole().equals("Employee")) 
            {
                String q = "select specific_role from employee_datails where id=?";
                PreparedStatement p = con.prepareStatement(q);
                p.setInt(1, m.getid());
                ResultSet r1 = p.executeQuery();
                r1.next();
                m.sets_role(r1.getString(1));
            }
            return m;
        } 
        catch (Exception e) {
            System.out.println("User Not Found");
            start.login();
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
            pst.setString(1, u.getname());
            pst.setString(2, u.getemail());
            pst.setString(3, u.getpassword());
            pst.setString(4, "Customer");
            pst.executeUpdate();
            
            PreparedStatement p = con.prepareStatement(q1);
            p.setString(1, u.getemail());
            p.setString(2, u.getpassword());
            ResultSet r = p.executeQuery();
            r.next();

            m.setid(r.getInt(1));
            m.setemail(u.getemail());
            m.setc_num(u.getc_num());
            m.setname(u.getname());
            m.setpassword(u.getpassword());
            m.setrole("Customer");

            PreparedStatement p1=con.prepareStatement(query1);
            p1.setInt(1, m.getid());
            p1.setLong(2, m.getc_num());
            p1.executeUpdate();
            return m;
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
            return null;
        }
    }
}
