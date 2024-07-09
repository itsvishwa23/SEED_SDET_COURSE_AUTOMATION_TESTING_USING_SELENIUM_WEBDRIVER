package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Vishwanath");
		driver.findElement(By.id("userEmail")).sendKeys("vishwa@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pune");
		driver.switchTo().frame(0);
		driver.findElement(By.id("submit")).click();

	}

}
