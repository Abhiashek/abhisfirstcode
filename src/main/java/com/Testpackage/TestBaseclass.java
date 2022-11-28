package com.Testpackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseclass {
	WebDriver driver;
	
	
	
	@BeforeMethod
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximizer");
		
		driver.get("https://www.leafground.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}
	

}
