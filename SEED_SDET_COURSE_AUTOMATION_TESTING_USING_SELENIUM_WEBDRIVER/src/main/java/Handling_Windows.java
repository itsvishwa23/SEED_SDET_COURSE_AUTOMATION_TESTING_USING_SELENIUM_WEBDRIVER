import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Windows {

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

		Set<String> windowSet = driver.getWindowHandles();
		Iterator<String> i = windowSet.iterator();
		String window1 = i.next();
		System.out.println("Title of first window   " + driver.getTitle());
		String window2 = i.next();
		driver.switchTo().window(window2);
		Thread.sleep(5000);
		System.out.println("Title of Second window    " + driver.getTitle());
		driver.findElement(By.partialLinkText("Financing Solutions")).click();
		driver.switchTo().window(window1);
		System.out.println("Title of first window   " + driver.getTitle());
		driver.quit();
	}

}
