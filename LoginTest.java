package polling;

import java.sql.SQLException;
import java.util.*;

public class LoginTest {
       
	  public static void main(String args[]) throws SQLException{
               
		  Scanner sc = new Scanner (System.in);
		  
		  LoginPojo login = new LoginPojo();
		  
		  System.out.println("Please enter the username");
		  String u_name = sc.next();
		  
		  System.out.println("Please enter the password");
		  String u_pwd = sc.next();
		  
		  System.out.println("Please enter  your 12 digit adhaar card number");
		  String u_cardNum = sc.next();
		  
		  //Assigning values to setter
		  login.setUsername_login(u_name);
		  login.setPassword_login(u_pwd);
		  login.setAdhaarCard_Number(u_cardNum);
		  
		  LoginCheck check = new LoginCheck();
		  check.checkLogin(login);
	  }
}
