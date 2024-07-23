package day_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day_10_ng {
	WebDriver driver;
	POM_Demo p;

	@Test
	public void demo_1() {
		p.Check_Login();
	}

	@BeforeTest
	public void beforeTest() {

		driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		p = new POM_Demo(driver);

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
