package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[normalize-space()='Forms']")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[1]/span[1]/div[1]/div[1]"))
				.click();

		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Vishwanath");
		driver.findElement(By.id("userEmail")).sendKeys("vishwa@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pune");

		driver.findElement(By.xpath("//button[@id='submit']")).click();



	}

}
