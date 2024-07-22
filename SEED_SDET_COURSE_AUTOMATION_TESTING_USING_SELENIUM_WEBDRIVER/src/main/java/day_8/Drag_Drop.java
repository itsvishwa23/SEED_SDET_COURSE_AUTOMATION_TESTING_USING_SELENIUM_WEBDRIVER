package day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement btn2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(btn1, btn2).perform();

	}

}
