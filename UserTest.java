package polling;

import java.sql.SQLException;
import java.util.*;
import java.util.regex.Pattern;

public class UserTest {

	public static void main(String args[]) throws SQLException{
		Scanner sc = new Scanner (System.in);
        
		UserPojo user_pojo = new UserPojo();

		// Getting values from user
		System.out.println("Enter the following details:");
		System.out.println("Enter the full name:");
		String a_name = sc.nextLine();
		System.out.println("Enter the card number:");
		String a_card = sc.nextLine();
		System.out.println("Enter date of birth:");
		String dob = sc.nextLine();
		System.out.println("Enter username:");
		String u_name = sc.nextLine();
		System.out.println("Enter the password with atleast 8 characters and with atleast one number:");
		String u_pwd = sc.nextLine();
		System.out.println("Retype the password:");
		String retype_pwd = sc.nextLine();
		System.out.println("Enter the mobile number:");
		String mob = sc.next();
		System.out.println("Enter your address:");
		String address = sc.next();
		System.out.println("Enter your gender");
		String gender = sc.next();
		
		int entry = 0;
		
//validation		
		if( a_card.length() == 12 && u_pwd.equals(retype_pwd) && mob.length() ==10);
		
		int count=0;
		if(a_card.length() != 12){
			  System.out.println("Enter the valid 12 digit adhaar card");
	          count++;
	     }
		
		if(!(Pattern.matches("[a-zA-Z]{8,}+[0-9]{1,}", u_pwd))){
			System.out.println("Please enter the password properly");
		    System.out.println("Enter Atleast 8 characters and with atleast one number HINT: abcdefgh1");
		    count++;
		}
	
	    if(!u_pwd.equals(retype_pwd)){
	    	System.out.println("Password mismatch");
	    	count++;
	    }
	    
	//if entries are correct 
	
	    if(count==0){	
		// Assigning values to corresponding POJO CLASS
	    	user_pojo.setAdhaarCard_Name(a_name);
			user_pojo.setAdhaarCard_Number(a_card);
			user_pojo.setDate_of_birth(dob);
			user_pojo.setUserName(u_name);
			user_pojo.setRetype_Password(retype_pwd);
			user_pojo.setMobile_Number(mob);
			user_pojo.setAddress(address);
			user_pojo.setGender(gender);
			user_pojo.setEntryFind(entry);
	    }
	    
	    System.out.println("AdhaarCard_Name=" + user_pojo.getAdhaarCard_Name() + ", AdhaarCard_Number=" + user_pojo.getAdhaarCard_Number()
				+ ", Date_of_birth=" + user_pojo.getDate_of_birth() + ", UserName=" + user_pojo.getUserName() + ", User_Password=" + user_pojo.getUser_Password()
				+ ", Retype_Password=" + user_pojo.getRetype_Password() + ", Mobile_Number=" + user_pojo.getMobile_Number() + ", Address=" + user_pojo.getAddress()
				+ ", Gender=" + user_pojo.getGender() + ", EntryFind=" + user_pojo.getEntryFind());
	    
	    User_Register register = new User_Register();
	    register.insertUserToDB(user_pojo);
	    
	}
}
