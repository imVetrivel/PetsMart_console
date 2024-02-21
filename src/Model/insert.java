package Model;

import java.sql.*;
import resources.*;
import connections.*;

public class insert {
    

    public static void insertlog(shoplog s,Users u)
    {
        String query = "insert into customer_history values(?,?,?,?,?,?)";

        try {
            Connection con = dbCon.getCon();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, u.getId());
            pst.setDate(2, s.getDate());
            pst.setString(3, s.getPurpose());
            pst.setInt(4, s.getPrice());
            pst.setInt(5, s.getA_age());
            pst.setString(6,s.getA_gender());

            pst.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Something went Wrong");
        }
    }
}
