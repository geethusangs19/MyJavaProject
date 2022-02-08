package Practice;

public class SecurityTemplate {
	private String adminUserName = "Admin2378";
	private String adminPwd = "Pass8945";
	private String adminPassCode = "Ad8738$";
	
	public String getAdminUserName() {
		return adminUserName;
	}
	
	public String getAdminPwd() {
		return adminPwd;
	}
	
	public String getAdminPassCode() {
		return adminPassCode;
	}	
	
}

 class Security extends SecurityTemplate{
	 
	public boolean checkAccess(String passCode) {
		if(passCode.equals(getAdminPassCode())) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkAccess(String userName, String password) {
		if(userName.equals(getAdminUserName()) && password.equals(getAdminPwd())) {
			return true;
		}
		else
		{
			return false;
		}
	}	
}

