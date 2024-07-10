package day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		System.out.println(
				"Check box displayed : " + driver.findElement(By.cssSelector("input[value='m']")).isDisplayed());

		driver.findElement(
				By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[24]/td[3]/input[2]")).click();

	}

}
