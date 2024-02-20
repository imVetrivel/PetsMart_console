package connections;

import java.sql.Connection;
import java.sql.DriverManager;

// singleton dbconnection class
public class dbCon {

  private static Connection con = null;

  public static Connection getCon() throws Exception 
  {
    if (con == null) 
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PetsMart", "root", "Vetri123");
 
      return con;
  }

}
