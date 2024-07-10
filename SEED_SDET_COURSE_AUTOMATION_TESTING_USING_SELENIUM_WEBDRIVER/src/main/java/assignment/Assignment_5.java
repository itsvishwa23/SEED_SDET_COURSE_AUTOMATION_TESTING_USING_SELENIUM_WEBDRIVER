package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
//
//		driver.findElement(By.xpath("//td[@class='table8']//input[1]")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[@class='table8']//input[2]")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//td[@class='table8']//input[3]")).click();

//		List<WebElement> lst = driver.findElements(By.xpath("//td[@class='table8']//input"));
//
//		lst.get(0).click();
//		lst.get(3).click();

		driver.findElement(By.xpath("//input[@name='option1']")).click();

	}

}
