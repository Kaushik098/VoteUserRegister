package polling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.regex.Pattern;

public class User_Register{

	Connection conn = ConnectionUtilisation.getConnection();
	
		public void insertUserToDB(UserPojo user_pojo) throws SQLException {
			// TODO Auto-generated method stub
			String insertUser = "INSERT INTO uservote_db (AdhaarCard_Name, AdhaarCard_Number, Date_of_birth, UserName, User_Password, Retype_Password, Mobile_Number, Address, Gender, EntryFind) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepare = conn.prepareStatement(insertUser);

			

			// Adding the inputs to Prepared Statement
			prepare.setString(1, user_pojo.getAdhaarCard_Name());
			prepare.setString(2, user_pojo.getAdhaarCard_Number());
			prepare.setString(3, user_pojo.getDate_of_birth());
			prepare.setString(4, user_pojo.getUserName());
			prepare.setString(5, user_pojo.getUser_Password());
			prepare.setString(6, user_pojo.getRetype_Password());
			prepare.setString(7, user_pojo.getMobile_Number());
			prepare.setString(8, user_pojo.getAddress());
			prepare.setString(9, user_pojo.getGender());
			prepare.setInt(10, user_pojo.getEntryFind());

	        int resultset = prepare.executeUpdate(insertUser);

			System.out.print(resultset + " Added");
		 
		       }  // end of method and SQL part
		
	     }
	
	
	

	




//String insertUser = "INSERT INTO uservote_db (AdhaarCard_Name, AdhaarCard_Number, Date_of_birth, UserName, User_Password, Retype_Password, Mobile_Number, Address, Gender, EntryFind) VALUES ( 'Mani', '23412353255', '09/8/2000', 'Manik', 'Manik001' , 'Manik001', 9898989898, 'Chennai', 'Male', 0)";
//Statement statement = conn.createStatement();
//int resultset = statement.executeUpdate(insertUser);
