package Model;

import java.sql.*;
import connections.*;
import resources.*;

public class update {

    public static boolean check(int id) {
        String query = "SELECT EXISTS(SELECT * from animal_details WHERE a_id=?)";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet r = pst.executeQuery();
            r.next();
            int z = r.getInt(1);
            if (z > 0)
                return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return false;
    }

    public static void cust_buy(int p_id) {
        String query = "delete from animal_details where a_id=?";
        String query1 = "select v_id from animal_details where a_id=?";
        String query2="select count(v_id) from animal_details where v_id=?";
        try 
        {
            Connection con = dbCon.getCon();

            PreparedStatement pst = con.prepareStatement(query1);
            pst.setInt(1, p_id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            int vid = rs.getInt(1);

            PreparedStatement pst1 = con.prepareStatement(query);
            pst1.setInt(1, p_id);
            pst1.executeUpdate();

            PreparedStatement pst2=con.prepareStatement(query2);
            pst2.setInt(1, vid);
            ResultSet rs2=pst2.executeQuery();
            rs2.next();
            int count=rs2.getInt(1);
            String query3="update variety set count=? where v_id=?";
            PreparedStatement pst3=con.prepareStatement(query3);
            pst3.setInt(1, count);
            pst3.setInt(2, vid);
            pst3.executeUpdate();
            
        } catch (Exception e) {
           System.out.println("Something went Wrong");
        }
    }

    public static shoplog buy(int p_id,String d,String name,String breed,String purpose)
    {
        shoplog s = new shoplog();
        String query = "select * from animal_details where a_id = ?";

        try 
        {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, p_id);
            ResultSet r = pst.executeQuery();
            r.next();
            s.setPrice(r.getInt(6));
            s.setA_age(r.getInt(5));
            s.setA_gender(r.getString(4));
            s.setDate(Date.valueOf(d));
            s.setId(p_id);
            s.setName(name);
            s.setPurpose(purpose+" "+breed);

        } catch (Exception e) {
            System.out.println("Something went Wrong ");
        }
        return s;
    }

    

}
