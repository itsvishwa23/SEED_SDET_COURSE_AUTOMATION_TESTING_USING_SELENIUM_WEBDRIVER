package testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/business_logic/f01_google.feature", // Path to your feature file
		glue = { "stepDefination" }, // Path to your step definition classes
		plugin = { "pretty", // To generate a readable report in the console

		})
public class TestRunner {

	@BeforeClass
	public void setUp() {
		// Any setup that needs to be done before tests run can be added here
	}

	@AfterClass
	public void tearDown() {
		// Any cleanup after all tests have run can be added here
	}
}
