package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vishwanath");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Taware");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vst@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
//		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, July 13th, 2024']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		driver.findElement(By.partialLinkText("NCR")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).submit();



		driver.quit();

	}

}