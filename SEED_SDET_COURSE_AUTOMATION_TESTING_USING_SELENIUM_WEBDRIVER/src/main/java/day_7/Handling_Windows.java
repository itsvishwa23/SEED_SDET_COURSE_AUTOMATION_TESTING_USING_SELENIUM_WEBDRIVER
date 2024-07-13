package day_7;

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
		driver.findElement(By.id("topMnubanking")).click();
		driver.findElement(By.xpath("//*[@id=\"bankingSubMenu\"]/div[1]/div/ul/li/ul[1]/li/a/b")).click();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> i = win.iterator();
		String win1 = i.next();
		System.out.println("First window title: " + driver.getTitle());
		String win2 = i.next();
		driver.switchTo().window(win2);
		System.out.println("Second window title: " + driver.getTitle());
		driver.findElement(By.xpath(
				"//a[@href='/portal/newgen/corporate/global_commercial_banking/CRB/trade_finance.htm?eOfferCode=INLOSMTLNTFSW']"))
				.click();

	}

}