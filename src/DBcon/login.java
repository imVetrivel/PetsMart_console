package DBcon;

import java.sql.*;

public class login {
    public static String[] signin(String mail, String pass) {
        String query = "select role,name,id from member_details where email = ? and password = ?";
        String z[] = new String[3];
        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, mail);
            pst.setString(2, pass);
            ResultSet r = pst.executeQuery();
            r.next();
            z[0] = r.getString(1);
            z[1] = r.getString(2);
            z[2] = String.valueOf(r.getInt(3));
            return z;
        } 
        catch (Exception e) {
            System.out.println("User Not Found");
            return null;
        }
    }

    public static boolean check(String mail){
        String query = "SELECT EXISTS(SELECT * from member_details WHERE email=?)";
        try 
        {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, mail);
            ResultSet r = pst.executeQuery();
            r.next();
            int z= r.getInt(1);
            if(z>0)
            {
                return true;
            }
            else
            {
                return false;
            }
        } 
        catch (Exception e) {
           System.out.println(e);
        }
        return false;
    }

    public static String[] signup(String mail, String pass, String name, String ph) {
        String query = "Insert into member_details (name,email,password,role)values(?,?,?,?)";
        String q1 = "select id from member_details where email =? and password =?";
        String query1 = "Insert into customer_details values(?,?)";
        String z[] = new String[3];
        try 
        {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, mail);
            pst.setString(3, pass);
            pst.setString(4, "Customer");
            pst.executeUpdate();
            PreparedStatement p1 = con.prepareStatement(q1);
            p1.setString(1, mail);
            p1.setString(2, pass);
            ResultSet rs = p1.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setInt(1, id);
            pst1.setString(2, ph);
            pst1.executeUpdate();
            z[0] = "Customer";
            z[1] = name;
            z[2] = String.valueOf(id);
            return z;
        } 
        catch (Exception e) {
            return null;
        }
    }
}
