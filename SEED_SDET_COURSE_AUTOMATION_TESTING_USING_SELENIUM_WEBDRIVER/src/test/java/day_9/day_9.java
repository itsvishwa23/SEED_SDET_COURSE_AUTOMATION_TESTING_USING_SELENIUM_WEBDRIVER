package day_9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class day_9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void Demo_1() {
        
    }

    @Test(priority = 2)
    public void Demo_2() {
        driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).click();
    }

    @Test(priority = 3)
    public void Demo_3() {
        driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).click();
    }

    @Test(priority = 4)
    public void Demo_4() {
        driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }
}
