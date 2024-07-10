package day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		System.out.println(
				"Check box displayed : " + driver.findElement(By.cssSelector("input[name^='chk_']")).isDisplayed());

		if (driver.findElement(By.cssSelector("input[name^='chk_']")).isSelected() == false) {
			driver.findElement(By.cssSelector("input[name^='chk_']")).click();
			System.out.println("Check Box Selected");

		} else {
			System.out.println("Check Box Already Selected");
		}

	}

}
