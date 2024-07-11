package day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Multi_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");

		WebElement wd = driver.findElement(By.xpath("//select[@id='fruits']"));

		Select drpdwn = new Select(wd);

		drpdwn.selectByVisibleText("Banana");
		drpdwn.selectByVisibleText("Apple");
		drpdwn.selectByVisibleText("Orange");

		List<WebElement> lst = drpdwn.getAllSelectedOptions();

		for (WebElement webElement : lst) {

			System.out.println(webElement.getText());

		}
	}

}
