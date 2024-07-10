package day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Both_Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement male = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement female = driver.findElement(By.xpath("//input[@value='f']"));

		System.out.println("Before Selection");
		System.out.println("Male");
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		System.out.println("Female");
		System.out.println(female.isDisplayed());
		System.out.println(female.isEnabled());
		System.out.println(female.isSelected());

		if (male.isSelected() == true) {

			driver.findElement(By.xpath("//input[@value='f']")).click();

		}

		Thread.sleep(5000);

		System.out.println("After Selection");
		System.out.println("Male");
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		System.out.println("Female");
		System.out.println(female.isDisplayed());
		System.out.println(female.isEnabled());
		System.out.println(female.isSelected());
		Thread.sleep(5000);

		driver.quit();

	}

}
