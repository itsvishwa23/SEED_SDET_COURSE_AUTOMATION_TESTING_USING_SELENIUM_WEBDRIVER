package my_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://demoqa.com/automation-practice-form");
//		driver.get("https://mdbootstrap.com/docs/standard/extended/dropdown-checkbox/#");

//		WebElement test = driver.findElement(By.id("ctl00_TripXpertLogo"));
//		WebElement test = driver.findElement(By.className("rigToolsWrapper"));
//		WebElement test = driver.findElement(By.linkText("Destinations"));
//		WebElement test = driver.findElement(By.partialLinkText("Desti"));
//		WebElement test = driver.findElement(By.name(""));
//		WebElement test = driver.findElement(By.tagName("div"));
//		
//
//		if (test != null) {
//
//			System.out.println("Element found.");
//
//		} else {
//			System.out.println("Element not found.");
//
//		}
//
//		
//		List<WebElement> lst_2 = driver.findElements(By.tagName("div"));
//		
//		System.out.println(lst_2.size());

//
//		WebElement drpdwn = driver.findElement(By.xpath("//select[@id='country']"));
//		Select dropdwn = new Select(drpdwn);
//		dropdwn.selectByVisibleText("Germany");
//		driver.close();

//		
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();

	}

}
