package modules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.LoginPage;

public class LoginModule extends LoginPage  {

	WebDriver driver=null;
	public LoginModule(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void userName(String uname)
	{
		username.sendKeys(uname);
		
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	
	public void btn()
	{
		btn_login.click();
		
	}
	
	public void loginValidUser(String uname,String password)
	{
		userName(uname);
		password(password);
		btn();
		Assert.assertTrue(pageHeader.getText().equals("TestProject Example page")); 
		
	}
}
