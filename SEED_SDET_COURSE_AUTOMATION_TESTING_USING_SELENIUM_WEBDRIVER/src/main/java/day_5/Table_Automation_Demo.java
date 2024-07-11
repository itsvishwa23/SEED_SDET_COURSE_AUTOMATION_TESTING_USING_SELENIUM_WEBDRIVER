package day_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Automation_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();



		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		driver.manage().window().maximize();

//		driver.findElement(By.linkText("Money")).click();
//		driver.findElement(By.xpath("//a[@href='//money.rediff.com/gainers/bse/daily/groupa']")).click();

		// Finding number of Columns
		List<WebElement> colum_no = driver.findElements(By.xpath("//th[normalize-space()]"));

		int colum_count = colum_no.size();

		System.out.println("The number of colums are:" + colum_count);

		// Finding number of Rows

		List<WebElement> row_no = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr"));

		for (WebElement webElement : row_no) {


			System.out.println(webElement.getText());

		}

		int row_count = row_no.size();

		System.out.println("The number of rows are:" + row_count);
		
		WebElement wele = driver.findElement(By.xpath("//td[normalize-space()='330.30']"));
		WebElement wele2 = driver.findElement(By.xpath("//th[normalize-space()='Current Price (Rs)']"));

		System.out.println(wele.getText());
		System.out.println(wele2.getText());

	}

}
