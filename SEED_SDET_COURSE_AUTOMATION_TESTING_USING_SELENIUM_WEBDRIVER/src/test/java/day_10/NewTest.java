package day_10;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	day_10 d;

	@Test
	public void f() {

		d.login_btn_check();
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
		day_10 d = new day_10(driver);

	}

	@AfterTest
	public void afterTest() {
	}

}
