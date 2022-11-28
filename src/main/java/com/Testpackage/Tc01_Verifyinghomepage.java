package com.Testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pomclass.Homepomclass;

public class Tc01_Verifyinghomepage extends TestBaseclass
{
	
@Test

public void verifyhomepage() throws InterruptedException
{
	Homepomclass hc = new Homepomclass(driver);
	hc.clickdropdown();
	System.out.println("click on dropdown");
	Thread.sleep(3000);
	hc.clickFrame();
	System.out.println("click on Frame");
	
	driver.switchTo().frame(hc.getframeElement());
	   Thread.sleep(2000);
	     
	   hc.clickbtn1();
	   System.out.println("iframe button clicked");
	   Thread.sleep(2000);
	   
	   String ExpectedText="Hurray! You Clicked Me.";
	   String actualtext=hc.clickbtntext();
	   System.out.println(actualtext);
	   Assert.assertEquals(actualtext, ExpectedText);
	   System.out.println("Geeting Actual Text");
	  
	   
//	   driver.switchTo().parentFrame();
//	   Thread.sleep(2000);
//	   
//	  driver.switchTo().frame(hc.getframeElement1());
//	  Thread.sleep(2000);
//	  
//	  hc.clickbtn2();
//	  System.out.println("Second iframe button is clicked");
//	  Thread.sleep(2000);
//	
	  driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   
	  driver.switchTo().frame(hc.getframeElement2());
	  Thread.sleep(2000);
	  System.out.println("Thirdiframe  clicked");
	  
	  driver.switchTo().frame(hc.getframeElement3());
	  Thread.sleep(2000);
	  System.out.println("childframe  clicked");
	  
	    hc.clickbtn3();
	    System.out.println("Thirdiframe button clicked");
	   Thread.sleep(2000);
	
	
  
}
}
