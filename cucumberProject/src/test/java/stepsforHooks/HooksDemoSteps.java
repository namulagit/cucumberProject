package stepsforHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	public static WebDriver driver=null;
	

	
	  @Before public void browserSetUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "./Servers/chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  
	  System.out.println(":::browserSetUp::");
	 
	  }
	 
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		 
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}

}
