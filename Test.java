package polling;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
public class Test {
      public static void main(String args[]) throws SQLException{
    	      Connection connection = ConnectionUtilisation.getConnection();
    	      System.out.println(connection);

    	   //CandidatePollCount Table   
    	      GetEntriesFromDB getentry = new GetEntriesFromDB();
    	      getentry.getPollCountsFromDb();
    	      
    	   //UserTable   
    	      GetUserEntries user_entry1 = new GetUserEntries();
    	      user_entry1.getUserEntries();
    	    		 
       }
}
