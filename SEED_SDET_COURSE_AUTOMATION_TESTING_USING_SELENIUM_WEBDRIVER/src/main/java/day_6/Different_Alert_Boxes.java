package day_6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Different_Alert_Boxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[normalize-space()='Forms']")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[@class='left-pannel']/div[@class='accordion']/div[3]/span[1]/div[1]/div[1]"))
				.click();

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Alerts']")).click();
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Thread.sleep(3000);
//		System.out.println(
//				driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//div[3]//div[1]")).getText());
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.sendKeys("Vishwanath");
		Thread.sleep(3000);
		alt.accept();
//		System.out.println(alt.getText());
		Thread.sleep(3000);
//
//		alt.accept();

		driver.quit();


		


	}

}
