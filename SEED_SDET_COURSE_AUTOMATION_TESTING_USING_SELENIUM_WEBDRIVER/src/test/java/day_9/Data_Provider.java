package day_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	WebDriver driver = new FirefoxDriver();

	@Test(dataProvider = "dp")
	public void Demo(String name, String email, String Current_Address, String Permanent_Address) throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Current_Address);
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(Permanent_Address);
		driver.findElement(By.xpath("//button[@id='submit']")).submit();

		Thread.sleep(3000);

		Assert.assertEquals(name, driver.findElement(By.xpath("//p[@id='name']")).getText());
		Assert.assertEquals(email, driver.findElement(By.xpath("//p[@id='email']")).getText());
		Assert.assertEquals(Current_Address, driver.findElement(By.xpath("//p[@id='currentAddress']")).getText());
		Assert.assertEquals(Permanent_Address, driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText());

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "Vishwanath", "Vishwanath@gmail.com", "Pune", "India" } };
	}

	@BeforeTest
	public void beforeTest() {
		driver.get("https://demoqa.com/text-box");

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
