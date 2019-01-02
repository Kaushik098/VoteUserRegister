package polling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class GetEntriesFromDB {
        
	Connection conn = ConnectionUtilisation.getConnection();
	
	public void getPollCountsFromDb(){
		try{
		String pollCount = "SELECT CandidateId, CandidateName, CandidatePollCount, CandidatePosition FROM PollCount";
        Statement statement = conn.createStatement();
        ResultSet resultset = statement.executeQuery(pollCount);
        
        while(resultset.next())
        	 System.out.println(resultset.getString(1)+ " "+resultset.getString(2)+" "+ resultset.getString(3)+" "+resultset.getString(4) );
	   }
		catch(Exception ae){
			System.out.println("Error existing");
		}
		finally
	      {
	          try
	          {
	              if(conn!=null)
	                  conn.close();
	          }
	          catch(SQLException se){}
	      }
	}
}
