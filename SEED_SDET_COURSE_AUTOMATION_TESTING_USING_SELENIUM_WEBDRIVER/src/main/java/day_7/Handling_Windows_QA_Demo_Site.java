package day_7;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Windows_QA_Demo_Site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

		Set<String> win = driver.getWindowHandles();

		Iterator<String> i = win.iterator();
		String win1 = i.next();
		String win2 = i.next();
		System.out.println("First window title: " + driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Second window title: " + driver.getTitle());

	}

}
