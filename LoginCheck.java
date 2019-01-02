package polling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class LoginCheck {
         
	  Connection conn = ConnectionUtilisation.getConnection();
	

	public void checkLogin(LoginPojo login) throws SQLException {
		// TODO Auto-generated method stub
	     
		String username_query1 =  "SELECT UserName FROM uservote_db WHERE AdhaarCard_Number = ?";
		PreparedStatement prepare1 = conn.prepareStatement(username_query1);
				
	    String userpassword_query1 = "SELECT User_Password FROM uservotedb WHERE AdhaarCard_Number = ?";
	    PreparedStatement prepare2 = conn.prepareStatement(userpassword_query1);
	    
	    
	    prepare1.setString(1, login.getUsername_login());
	    prepare2.setString(1, login.getPassword_login());
	    
	    
	    
	    if(prepare1.equals(username_query1) && prepare2.equals(userpassword_query1)){
	    	System.out.println("Welcome "+ login.getUsername_login()+"Please cast your vote to your favourie candidate");
	    }
	    
        ResultSet resultset1 = prepare1.executeQuery(username_query1);
        ResultSet resultset2 = prepare2.executeQuery(userpassword_query1);

	    
	}
}
