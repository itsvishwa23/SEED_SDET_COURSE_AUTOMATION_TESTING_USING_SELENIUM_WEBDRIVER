package day_5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Automation_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		driver.manage().window().maximize();

//		driver.findElement(By.linkText("Money")).click();
//		driver.findElement(By.linkText("More gainers")).click();

		// Finding number of Columns
		List<WebElement> columnsNumber = driver.findElements(By.xpath("//th[normalize-space()]"));

		for (WebElement webElement : columnsNumber) {

			System.out.println(webElement.getText());

		}

		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);
	}

}
