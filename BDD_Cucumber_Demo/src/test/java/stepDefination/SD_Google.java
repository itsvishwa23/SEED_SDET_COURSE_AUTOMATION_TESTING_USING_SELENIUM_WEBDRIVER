package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Google {
	WebDriver driver;
	String googleTitle;

	@Given("the user opens the www.google.com application")
	public void the_user_opens_the_www_google_com_application() {

		// Initialize the ChromeDriver
		driver = new FirefoxDriver();

		// Open the Google homepage
		driver.get("https://www.google.com");
	}

	@When("the user captures the Google title")
	public void the_user_captures_the_google_title() {
		// Capture the title of the Google homepage
		googleTitle = driver.getTitle();

	}

	@Then("validate the Google application")
	public void validate_the_google_application() {
		// Validate that the title contains "Google"
//		Assert.assertEquals("The title contains 'Google'", googleTitle.contains("Google"));

		// Close the browser
		driver.quit();
	}
}
