package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	
private WebDriver driver; 
	
	public HomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "keyword")
	private WebElement keywordTxtBox;

	
	public void enterValueInUser(String keywordValue) {
		keywordTxtBox.sendKeys(keywordValue);
	}
}
