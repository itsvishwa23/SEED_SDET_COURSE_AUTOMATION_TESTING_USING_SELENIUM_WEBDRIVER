package day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		List<WebElement> lst = driver.findElements(By.tagName("a"));
		System.out.println("The links are:");
		System.out.println(lst.size());

		for (int i = 0; i < lst.size(); i++) {
			WebElement element = lst.get(i);
			String linkText = element.getText();
			
			System.out.println((i + 1) + ". " + linkText + " - " );
		}

		
		driver.quit();
	}
}
