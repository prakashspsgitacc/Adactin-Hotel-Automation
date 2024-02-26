package com.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "login")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//b[contains(text(),'Invalid' )] ")
	private WebElement txtLoginErrorMsg;
	
	

	public WebElement getTxtLoginErrorMsg() {
		return txtLoginErrorMsg;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

	public void login(String username, String password) {
		
		elementSendkeys(getTxtUserName(), username);
		elementSendkeys(getTxtPassword(), password);
		elementClick(getBtnLogin());

		
	}
	
	
	

}
