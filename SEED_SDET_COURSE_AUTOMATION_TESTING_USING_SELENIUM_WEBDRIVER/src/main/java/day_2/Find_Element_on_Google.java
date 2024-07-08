package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Element_on_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.className("gLFyf"));

		search.sendKeys("Seed Infotech");
		search.sendKeys(Keys.ENTER);
//		search.submit();

	}

}
