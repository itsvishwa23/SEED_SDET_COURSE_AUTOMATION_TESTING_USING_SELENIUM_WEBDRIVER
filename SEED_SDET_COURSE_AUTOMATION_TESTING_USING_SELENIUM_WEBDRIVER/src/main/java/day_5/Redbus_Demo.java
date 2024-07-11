package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Sol");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[normalize-space()='Solapur']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Sol");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Kolhapur(Maharashtra)']"))
				.click();

	}

}
