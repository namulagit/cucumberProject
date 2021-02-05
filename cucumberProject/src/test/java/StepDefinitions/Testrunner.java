package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.testng.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features" }, glue = {
		"StepDefinitions" }, monochrome = true, plugin = { "pretty",
				"json:target/JSONreports/report.json" }, tags = "@Imp")
public class Testrunner {

}
