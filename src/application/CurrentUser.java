package application;

public class CurrentUser {
	private String name;
	private String roleID;
	private String userName;

	public CurrentUser(){
	}
	
	public CurrentUser(String name, String roleID){ //unused so far
		this.name = name;
		this.roleID = roleID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
