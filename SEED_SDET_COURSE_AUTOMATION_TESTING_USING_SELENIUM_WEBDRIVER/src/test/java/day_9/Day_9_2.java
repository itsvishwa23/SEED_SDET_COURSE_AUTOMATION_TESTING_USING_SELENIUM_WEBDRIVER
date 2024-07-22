package day_9;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Day_9_2 {
	
	 WebDriver driver;
  @Test(priority=1)
  public void Demo_1() {
	  
	  driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys("Vishwanath");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Pass@123");
	  driver.findElement(By.xpath("//input[@id='Butsub']")).click();
  }
  @Test(priority=2)
  public void Demo_2() {
	  driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys("Vishwanath");
	
	  driver.findElement(By.xpath("//input[@id='Butsub']")).click();
  }
  @Test(priority=3)
  public void Demo_3() {
	  
	  
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Pass@123");
	  driver.findElement(By.xpath("//input[@id='Butsub']")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 
      driver.findElement(By.xpath("//input[@id='txtCustomerID']")).clear();
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
      driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  if (driver != null) {
          driver.quit();
      }
  }

}
