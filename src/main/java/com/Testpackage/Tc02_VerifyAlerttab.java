package com.Testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.pomclass.Homepomclass;

public class Tc02_VerifyAlerttab extends TestBaseclass
{
@Test
public void verifyAlettab() throws InterruptedException
{
	Homepomclass hc = new Homepomclass(driver);
	hc.clickdropdown();
	System.out.println("click on dropdown");
	Thread.sleep(3000);
	
	hc.clickAlert();
	System.out.println("click on alert tab");
	Thread.sleep(3000);
	
	hc.clickshow();
	System.out.println("click on show tab");
	Thread.sleep(3000);
	
	Alert alt = driver.switchTo().alert();
	alt.accept();
	System.out.println("alert is accepted");
	
	hc.clickshowdialog();
	System.out.println("click on showdialog");
	Thread.sleep(3000);
//	Alert alt1 = driver.switchTo().alert();
	alt.sendKeys("Abhi");
	Thread.sleep(5000);
	System.out.println("pass the word");
	
//     Actions act =new Actions(driver);
//     act.sendKeys(Keys.ENTER).perform();
//     Thread.sleep(1000);
}
}
