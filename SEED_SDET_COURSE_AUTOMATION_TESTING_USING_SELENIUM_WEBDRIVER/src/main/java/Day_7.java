import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("//a[@class='newclose3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='topMnubanking']")).click();
		driver.findElement(By.linkText("Citi Commercial Bank")).click();
		driver.quit();

	}

}
