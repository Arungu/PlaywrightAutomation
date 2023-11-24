package org.POM;

public class LoginPage {
	
	private String userName="//*[@id='Login:LoginScreen:LoginDV:username-inputEl']";
	private String password="//*[@id='Login:LoginScreen:LoginDV:password-inputEl']";
	private String loginBtn="//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']";
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn(String loginBtn) {
		this.loginBtn = loginBtn;
	}
	

}
