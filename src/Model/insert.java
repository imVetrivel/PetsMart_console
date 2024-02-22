package Model;

import java.sql.*;
import resources.*;
import connections.*;
import java.util.*;

public class insert {

    public static void insertlog(shoplog s, Users u) {
        String query = "insert into customer_history values(?,?,?,?,?,?)";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, u.getId());
            pst.setDate(2, s.getDate());
            pst.setString(3, s.getPurpose());
            pst.setInt(4, s.getPrice());
            pst.setInt(5, s.getA_age());
            pst.setString(6, s.getA_gender());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
    }

    public static boolean checkcategory(String c) {
        String query = "select exists(select * from category where category = ?)";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, c);
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

    public static boolean checkvariety(String c) {
        String query = "select exists(select * from variety where breed = ?)";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, c);
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

    public static void addexistspets(ArrayList<pets> p) {
        String query = "insert into animal_details (c_id,v_id,breed,gender,age,price) values (?,?,?,?,?,?)";
        String query1 = "select c_id,v_id from animal_details where breed=?";
        String query2 = "select count(v_id) from animal_details where v_id=?";
        String query3 = "update variety set count=? where v_id=?";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query1);
            pst.setString(1, p.get(0).getBreed());
            ResultSet r = pst.executeQuery();
            r.next();
            int cid = r.getInt(1);
            int vid = r.getInt(2);

            PreparedStatement pst1 = con.prepareStatement(query);
            for (int i = 0; i < p.size(); i++) 
            {
                pst1.setInt(1, cid);
                pst1.setInt(2, vid);
                pst1.setString(3, p.get(i).getBreed());
                pst1.setString(4, p.get(i).getGender());
                pst1.setInt(5, p.get(i).getA_age());
                pst1.setInt(6, p.get(i).getPrice());
                pst1.executeUpdate();
            }

            PreparedStatement pst2 = con.prepareStatement(query2);
            pst2.setInt(1, vid);
            ResultSet rs = pst2.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            PreparedStatement pst3 = con.prepareStatement(query3);
            pst3.setInt(1, count);
            pst3.setInt(2, vid);
            pst3.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }

    }
}
