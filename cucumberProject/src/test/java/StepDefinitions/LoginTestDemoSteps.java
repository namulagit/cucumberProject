package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import modules.LoginModule;

public class LoginTestDemoSteps {
WebDriver driver=null;
	
	@Given("browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver", "./Servers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String uname,String pass) {
		
		new LoginModule(driver)
		.loginValidUser(uname, pass);
		
			}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	  
	Thread.sleep(4000);
	driver.close();
	}
}
