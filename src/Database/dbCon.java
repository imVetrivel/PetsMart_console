package Database;

import java.sql.Connection;
import java.sql.DriverManager;
public class dbCon {

    public static Connection getCon() throws Exception{
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PetsMart", "root", "Vetri123");
      return con;
      }
        
}
