package my_practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/imagegallery/");


//		WebElement test = driver.findElement(By.id("ctl00_TripXpertLogo"));
//		WebElement test = driver.findElement(By.className("rigToolsWrapper"));
//		WebElement test = driver.findElement(By.linkText("Destinations"));
//		WebElement test = driver.findElement(By.partialLinkText("Desti"));
//		WebElement test = driver.findElement(By.name(""));
		WebElement test = driver.findElement(By.tagName("div"));
		

		if (test != null) {

			System.out.println("Element found.");

		} else {
			System.out.println("Element not found.");

		}

		
		List<WebElement> lst_2 = driver.findElements(By.tagName("div"));
		
		System.out.println(lst_2.size());


		driver.close();
	}

}
