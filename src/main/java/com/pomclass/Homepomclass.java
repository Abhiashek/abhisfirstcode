package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepomclass {

	public WebDriver driver;
	
	
	@FindBy(xpath = "(//li[@id='menuform:j_idt39'])")
	private WebElement dropdown;
	
	public void clickdropdown()
	{
		dropdown.click();
		
	}
	
	@FindBy(xpath = "(//li[@role='menuitem'])[6]")
	private WebElement Frame;
	
	public void clickFrame()
	{
		Frame.click();
		
	}
	
	@FindBy(xpath = "//iframe[@src='default.xhtml']")
	public WebElement Frame1;
	
	public WebElement getframeElement()
	{
		
		return Frame1;
		
	}
	
	@FindBy(xpath = "//button[text()='Click Me']")
	private WebElement clickmebtn;
	
	public void clickbtn1()
	{
		clickmebtn.click();
		
	}
	
	@FindBy(xpath = "//button[text()='Hurray! You Clicked Me.']")
	public WebElement clickmetext;
	
	public String clickbtntext()
	{
		String result =clickmetext.getText();
		return result;
		
		
	}
	
	@FindBy(xpath = "//iframe[@src='nested.xhtml']")
	public WebElement Frame2;
	
	public WebElement getframeElement1()
	{
		
		return Frame2;
		
	}
	
	@FindBy(xpath = "//button[text()='Count Frames']")
	private WebElement clickmebtn1;
	
	public void clickbtn2()
	{
		clickmebtn1.click();
		
	}
	
	@FindBy(xpath = "//iframe[@src='page.xhtml']")
	public WebElement Frame3;
	
	public WebElement getframeElement2()
	{
		
		return Frame3;
		
	}
	
	@FindBy(xpath = "//iframe[@src='framebutton.xhtml']")
	public WebElement Childframe;
	
	public WebElement getframeElement3()
	{
		
		return Childframe;
		
	}
	
	@FindBy(xpath = "//button[text()='Click Me']")
	private WebElement clickmebtn2;
	
	public void clickbtn3()
	{
		clickmebtn2.click();
		
	}
	
	
	
	@FindBy(xpath = "(//li[@role='menuitem'])[5]")
	private WebElement Alert;
	
	public void clickAlert()
	{
		Alert.click();
		
	}
	
	@FindBy(xpath = "(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link'])[1]")
	private WebElement showpopup;
	
	public void clickshow()
	{
		showpopup.click();
		
	}
	
	
	@FindBy(xpath = "(//span[@class='ui-button-text ui-c'])[6]")
	private WebElement showdialog;
	
	public void clickshowdialog()
	{
		showdialog.click();
		
	}
	
	
	
	
	public Homepomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
