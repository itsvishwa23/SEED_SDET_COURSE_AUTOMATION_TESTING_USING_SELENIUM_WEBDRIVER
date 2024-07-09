package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.partialLinkText("Create a new account")).click();
		driver.findElement(By.name("nameec59ee39")).sendKeys("Vishwanath Sopan Taware");
		driver.findElement(By.name("loginec59ee39")).sendKeys("vst");
		driver.findElement(By.name("passwdec59ee39")).sendKeys("Pass@123");
		driver.findElement(By.name("confirm_passwdec59ee39")).sendKeys("Pass@123");
		driver.findElement(By.name("altemailec59ee39")).sendKeys("test@mail.com");

	}

}
