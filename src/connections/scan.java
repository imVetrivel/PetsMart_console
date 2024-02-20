package connections;

import java.util.*;

// singleton scanner class
public class scan {

       private static Scanner sc = null;

       public static Scanner getscanner() {
              if (sc == null)
                sc = new Scanner(System.in);

              return sc;
       }
}
