package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

	
	@When("user is on Login page")
	public void user_is_on_login_page() {
	   System.out.println("user is on Login page");	
	   }

	@When("user enters user name and pass")
	public void user_enters_user_name_and_pass() {
		System.out.println("--user enters user name and pass");	
	}

	@When("user clicks on Submit")
	public void user_clicks_on_submit() {
		System.out.println("--user clicks on Submit");	
	}

	@Then("User see a login page")
	public void user_see_a_login_page() {
		System.out.println("--User see a login page");
	}
	
}
