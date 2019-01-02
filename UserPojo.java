package polling;

public class UserPojo {

	private String AdhaarCard_Name;
	private String AdhaarCard_Number;
	private String Date_of_birth;
	private String UserName;
	private String User_Password;
	private String Retype_Password;
	private String Mobile_Number;
	private String Address;
	private String Gender;
	private int EntryFind;
	public String getAdhaarCard_Name() {
		return AdhaarCard_Name;
	}
	public void setAdhaarCard_Name(String adhaarCard_Name) {
		AdhaarCard_Name = adhaarCard_Name;
	}
	public String getAdhaarCard_Number() {
		return AdhaarCard_Number;
	}
	public void setAdhaarCard_Number(String adhaarCard_Number) {
		AdhaarCard_Number = adhaarCard_Number;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUser_Password() {
		return User_Password;
	}
	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}
	public String getRetype_Password() {
		return Retype_Password;
	}
	public void setRetype_Password(String retype_Password) {
		Retype_Password = retype_Password;
	}
	public String getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getEntryFind() {
		return EntryFind;
	}
	public void setEntryFind(int entryFind) {
		EntryFind = entryFind;
	}
	@Override
	public String toString() {
		return "UserPojo [AdhaarCard_Name=" + AdhaarCard_Name + ", AdhaarCard_Number=" + AdhaarCard_Number
				+ ", Date_of_birth=" + Date_of_birth + ", UserName=" + UserName + ", User_Password=" + User_Password
				+ ", Retype_Password=" + Retype_Password + ", Mobile_Number=" + Mobile_Number + ", Address=" + Address
				+ ", Gender=" + Gender + ", EntryFind=" + EntryFind + "]";
		
//		System.out.println("AdhaarCard_Name=" + AdhaarCard_Name + ", AdhaarCard_Number=" + AdhaarCard_Number
//				+ ", Date_of_birth=" + Date_of_birth + ", UserName=" + UserName + ", User_Password=" + User_Password
//				+ ", Retype_Password=" + Retype_Password + ", Mobile_Number=" + Mobile_Number + ", Address=" + Address
//				+ ", Gender=" + Gender + ", EntryFind=" + EntryFind);
	}
	
}
