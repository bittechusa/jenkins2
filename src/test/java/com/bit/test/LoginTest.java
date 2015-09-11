package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest 
{
	FirefoxDriver driver ;
	
	@Before
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void loginTest()
	{
		driver.findElement(By.id("email")).sendKeys("asad@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

}
