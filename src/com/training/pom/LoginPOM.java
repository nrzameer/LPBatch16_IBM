package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.generics.GenericMethods;

public class LoginPOM {
	private WebDriver driver; 
	
	GenericMethods genericmethod;
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	
	
	public void sendUserName(String userName) {
		genericmethod = new GenericMethods(driver);
		genericmethod.txtBoxVisibility(this.userName, userName);
		//this.userName.clear();
	//	this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		genericmethod.txtBoxVisibility(this.password, password);
	//	this.password.clear(); 
	//	this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		genericmethod.linkVisibility(this.loginBtn);
	//	this.loginBtn.click(); 
	}
}
