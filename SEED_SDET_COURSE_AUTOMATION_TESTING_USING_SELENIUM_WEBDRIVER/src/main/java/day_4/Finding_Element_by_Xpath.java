package day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Finding_Element_by_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/input[1]"))
				.sendKeys("Vishwa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

	}

}
