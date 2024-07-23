package day_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day_9_3 {
	WebDriver driver;

	@Test(dataProvider = "dp")

	public void f(String uname, String pwd) {
	}

	@BeforeMethod
	public void beforeMethod() {

		driver.findElement(By.xpath("//input[@id='txtCustomerID']")).clear();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();

	}

	@AfterMethod
	public void afterMethod() {

	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		if (driver != null) {
			driver.quit();

		}
	}

}
