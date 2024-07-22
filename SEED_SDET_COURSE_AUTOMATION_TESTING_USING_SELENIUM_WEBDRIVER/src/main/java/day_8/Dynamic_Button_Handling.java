package day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_Button_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		Actions act = new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement btn2 = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.doubleClick(btn1).perform();
		act.click(btn2).perform();
		act.contextClick(btn3).perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText());

	}

}
