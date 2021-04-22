package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOPom extends LibGenericPOM{

	//Default Constructor
	public LoginPOJOPom() {
		
		PageFactory.initElements(driver, this);
	}
	//WebElemnts
	//@FindBy(id ="email")
	//@FindBys({@FindBy(id ="email"),@FindBy(name ="email")})
	@FindAll({@FindBy(id ="email"),@FindBy(name ="email")})
	private WebElement txtUserName;
	
	@FindBy(id ="passwd")
	private WebElement txtpassword;
	
	@FindBy(id ="SubmitLogin")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getBtnCreateAnAccount() {
		return getBtnCreateAnAccount();
	}
	
}
