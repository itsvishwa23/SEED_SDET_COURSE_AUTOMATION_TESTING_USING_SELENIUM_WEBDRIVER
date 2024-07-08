package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Element_By_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

//		WebElement check = driver
//				.findElement(By.linkText("Over 40 school children injured as bus overturns in Haryana"));

		WebElement check = driver.findElement(By.partialLinkText("Over 40"));

		check.click();

		if (check == null) {

			System.out.println("Not Foud");

		} else {
			System.out.println("Found");
		}

	}

}
