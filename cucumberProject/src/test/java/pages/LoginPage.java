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
		
	}
	
	/*
	 * By username=By.id("name"); By password=By.id("password"); By
	 * btn_login=By.id("login");
	 */
	
	@FindBy(id="name")
	public WebElement  username;
	
	@FindBy(id="password")
	public WebElement  password;
	
	@FindBy(id="login")
	public WebElement  btn_login;
	
	
}
