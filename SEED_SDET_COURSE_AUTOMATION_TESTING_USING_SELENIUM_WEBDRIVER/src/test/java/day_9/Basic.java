package day_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = 1)
	public void demo() {

		driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).click();
		String expected_output = "Gmail: Private and secure email at no cost | Google Workspace";
		String actual_output = driver.getTitle();
		Assert.assertEquals(expected_output, actual_output);

	}

	@Test(priority = 2)
	public void demo_2() {
		driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).click();
		String expected_output = "Google Images";
		String actual_output = driver.getTitle();
		Assert.assertEquals(expected_output, actual_output);

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.google.com/");

	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
