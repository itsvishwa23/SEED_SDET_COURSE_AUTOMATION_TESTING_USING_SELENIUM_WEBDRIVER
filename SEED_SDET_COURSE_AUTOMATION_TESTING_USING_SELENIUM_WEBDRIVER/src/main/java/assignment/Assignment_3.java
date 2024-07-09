package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.findElement(By.id("txtCustomerID")).sendKeys("123456789");
		driver.findElement(By.id("txtPassword")).sendKeys("123456789");
		driver.findElement(By.id("Butsub")).click();

		String status = driver.findElement(By.id("lblMsg")).getText();

		if (status.contains("Invalid Username/Password") || status.contains("Enter Username")) {

			System.out.println("Test Passed");

		} else {

			System.out.println(" Test Fail");

		}

	}

}
