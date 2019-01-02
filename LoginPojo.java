package polling;

public class LoginPojo {
         
	private String username_login;
	private String password_login;
	private String AdhaarCard_Number;
	
	public String getUsername_login() {
		return username_login;
	}
	public void setUsername_login(String username_login) {
		this.username_login = username_login;
	}
	public String getPassword_login() {
		return password_login;
	}
	public void setPassword_login(String password_login) {
		this.password_login = password_login;
	}
	public String getAdhaarCard_Number() {
		return AdhaarCard_Number;
	}
	public void setAdhaarCard_Number(String adhaarCard_Number) {
		AdhaarCard_Number = adhaarCard_Number;
	}
	@Override
	public String toString() {
		return "LoginPojo [username_login=" + username_login + ", password_login=" + password_login
				+ ", AdhaarCard_Number=" + AdhaarCard_Number + "]";
	}
	
	
}
