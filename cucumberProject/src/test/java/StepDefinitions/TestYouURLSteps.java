package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import StepDefinitions.HooksDemoSteps;

public class TestYouURLSteps  {

	WebDriver driver=HooksDemoSteps.driver;
	@When("user open URL")
	public void user_open_url() {
	 driver.get("http://www.testyou.in/Login.aspx");
	}

	@When("EnterUSERID  PAS and click on Login button")
	public void enter_userid_pas_and_click_on_login_button() {
	   driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']")).sendKeys("test");
	   
	   driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']")).sendKeys("test");
	   
	   driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']")).click();
	}

	@Then("user id pass did match will display")
	public void user_id_pass_did_match_will_display() {
		System.out.println("user_id_pass_did_match_will_display");
	}
}
