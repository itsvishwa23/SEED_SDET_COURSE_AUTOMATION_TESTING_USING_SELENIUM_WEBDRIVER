package day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement drp_dwn = driver.findElement(By.xpath("//select[@id='country']"));

		Select ddwn = new Select(drp_dwn);

		List<WebElement> lst = ddwn.getOptions();
		System.out.println(lst.size());

		int i = 0;

		for (WebElement webElement : lst) {

			System.out.println(i + "." + webElement.getText());

			i++;

		}

		System.out.println(ddwn.getFirstSelectedOption().getText());

		ddwn.selectByVisibleText("Pakistan");

		System.out.println(ddwn.getFirstSelectedOption().getText());

	}

}
