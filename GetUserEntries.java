package polling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class GetUserEntries {
       
	Connection conn = ConnectionUtilisation.getConnection();
	
	public void getUserEntries() throws SQLException{
		   String user_entries = "SELECT * FROM uservote_db";
		   Statement statement = conn.createStatement();
		   ResultSet result = statement.executeQuery(user_entries);
		   
		   while(result.next())
		       	  System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" "+result.getString(6)+" "+result.getString(7)+" "+result.getString(8)+" "+result.getString(9)+" "+result.getString(10)+" "+result.getString(11));
	}
}
