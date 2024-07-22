package day_7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Dynamic_Menus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://www.istqb.in/");

		// main menu options printing
		List<WebElement> lst = driver.findElements(By
				.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li"));

		System.out.println(lst.size());

		for (WebElement webElement : lst) {
			System.out.println(webElement.getText());

		}
		// dynamic menu handling
		Actions act = new Actions(driver);
		WebElement menuElementtest = driver.findElement(
				By.xpath("//li[@class='sp-menu-item sp-has-child']//a[@href='#!'][normalize-space()='ABOUT US']"));

		act.moveToElement(menuElementtest).perform();
		

		List<WebElement> lst2 = driver
				.findElements(By.xpath("//*[contains(@class, 'sp-menu-item') and contains(@class, 'sp-has-child')]"));

		System.out.println(lst2.size());

		for (WebElement webElement : lst2) {

			System.err.println(webElement.getText());

		}

	}

}
