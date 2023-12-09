package com.advic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.addvic.log.LogInPGE;

public class TestLogPage {
	
	
	WebDriver driver = null;
	
	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ingecnotechnologies.com/other/Wcart/customer/site/login");
		driver.manage().window().maximize();
		
		LogInPGE lg = new LogInPGE(driver);
		lg.Login("poonam", "sukode@123");
	
	}
}
