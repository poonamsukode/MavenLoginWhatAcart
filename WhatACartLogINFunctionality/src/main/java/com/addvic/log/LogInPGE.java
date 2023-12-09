package com.addvic.log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPGE {
	
	WebDriver driver = null;
	public LogInPGE(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginform-username")
	WebElement username;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginform-rememberme\"]")
	WebElement label;

	@FindBy(xpath="//button")
	WebElement button;
	
	public void Login(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		label.click();
		button.click();
	}
	
	
	
}
