package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_6 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://practice.automationtesting.in/");

		driver.manage().window().maximize();

		List<WebElement> sliders = driver.findElements(By.className("n2-ss-slide-background"));

		int sliderCount = sliders.size();

		System.out.println("Number of sliders: " + sliderCount);

		driver.quit();
	}
}
