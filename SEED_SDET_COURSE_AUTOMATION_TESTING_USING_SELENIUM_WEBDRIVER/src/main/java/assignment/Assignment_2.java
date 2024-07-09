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
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Vishwanath Sopan Taware");
		driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("vst");
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Pass@123");
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Pass@123");
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("test@mail.com");

	}

}
