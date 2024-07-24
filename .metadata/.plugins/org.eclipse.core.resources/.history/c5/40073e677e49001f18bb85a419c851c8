package day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Demo {

	WebDriver d;

	public POM_Demo(WebDriver driver) {
		// TODO Auto-generated constructor stub
		d = driver;

	}

	public void Check_Login() {
		d.findElement(By.xpath("//input[@id='login1']")).sendKeys("Vishwa");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		d.findElement(By.xpath("//input[@title='Sign in']")).click();

	}

}
