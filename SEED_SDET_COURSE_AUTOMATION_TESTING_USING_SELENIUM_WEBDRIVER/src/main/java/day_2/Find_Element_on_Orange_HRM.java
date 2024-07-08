package day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Find_Element_on_Orange_HRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("login")).sendKeys("Admin");
		driver.findElement(By.name("passwd")).sendKeys("Admin");
		driver.findElement(By.name("proceed")).click();
		driver.close();
	}

}
