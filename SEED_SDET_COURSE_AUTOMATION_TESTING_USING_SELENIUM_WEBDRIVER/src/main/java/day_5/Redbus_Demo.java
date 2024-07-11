package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Sol");

		// Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[normalize-space()='Solapur']")));

		driver.findElement(By.xpath("//text[normalize-space()='Solapur']")).click();

		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Kolh");

		driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Kolhapur(Maharashtra)']"))
				.click();

	}


}

