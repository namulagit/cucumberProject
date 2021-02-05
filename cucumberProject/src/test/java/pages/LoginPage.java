package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	protected LoginPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		if(!driver.getTitle().equals("TestProject Demo"))
		{
			
			throw new IllegalStateException("ths is not login page the current page is "+driver.getCurrentUrl());
		}
		
	}
	
	
	@FindBy(id="name")
	public WebElement  username;
	
	@FindBy(id="password")
	public WebElement  password;
	
	@FindBy(id="login")
	public WebElement  btn_login;
	
	@FindBy(xpath="//div[@id='pageProfile']//h1[contains(text(),'TestProject Example page')]")
	public WebElement  pageHeader;
	
	
}
