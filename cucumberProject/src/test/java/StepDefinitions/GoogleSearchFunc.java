package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchFunc {
	ChromeDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		// System.out.println("inside step-browser is opene");
		
		
		  System.setProperty("webdriver.chrome.driver", "./Servers/chromedriver.exe");
		  driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(10,
		  TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(5,
		  TimeUnit.SECONDS);
		 
		 
		 
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside step-user is on google search page");

		driver.get("https://www.google.com/");
		System.out.println("inside step-browser is opene");
		driver.manage().window().maximize();

		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("inside step-user enters a text in search box");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step By step");
	}

	@When("hit enter")
	public void hit_enter() {
		System.out.println("inside step-hit enter");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("inside step -user is navigated to search results");
		
		driver.getPageSource().contains("Online courses");
		/*
		 * driver.close(); driver.quit();
		 */
	}

}
