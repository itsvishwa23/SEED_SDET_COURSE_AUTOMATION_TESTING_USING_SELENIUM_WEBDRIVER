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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7744062398");
//		driver.findElement(By.xpath(
//				"//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))
//				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(
//				"//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))
//				.sendKeys("M");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//input[@id='uploadPicture']"))
				.sendKeys("/Users/vishwanathtaware/Downloads/2IMCC_JULY_2024.jpg");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pune");

	}

}
