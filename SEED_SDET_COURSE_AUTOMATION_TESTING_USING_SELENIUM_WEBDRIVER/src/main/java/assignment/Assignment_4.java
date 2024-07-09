package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.className("gLFyf")).sendKeys("Pune");
		driver.findElement(By.className("gNO89b")).submit();

		Thread.sleep(5000);

		if (driver.getCurrentUrl().contains("Pune")) {
			System.out.println("Test case is pass");
		} else {
			System.out.println("Test case is fail");
		}

	}

}
