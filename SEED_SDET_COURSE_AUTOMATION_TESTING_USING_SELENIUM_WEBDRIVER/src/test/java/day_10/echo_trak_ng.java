package day_10;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class echo_trak_ng {
	WebDriver driver;
	echo_trak e;

	@Test
	public void f() {
		e.login();
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {

		e = new echo_trak(driver);

	}

	@AfterTest
	public void afterTest() {
	}

}
