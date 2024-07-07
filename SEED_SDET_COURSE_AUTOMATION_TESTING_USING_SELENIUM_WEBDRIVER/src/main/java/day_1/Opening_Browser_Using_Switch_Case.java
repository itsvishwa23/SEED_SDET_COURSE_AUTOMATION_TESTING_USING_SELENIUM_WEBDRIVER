package day_1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opening_Browser_Using_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		System.out.println("Enter your choice");
		System.out.println("1: Firefox");
		System.out.println("2: Chrome");
		System.out.println("3: Edge");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			WebDriver driver1 = new FirefoxDriver();
			driver1.get("https://www.google.com/");
			break;

		case 2:
			WebDriver driver2 = new ChromeDriver();
			driver2.get("https://www.google.com/");
			break;

		case 3:
			WebDriver driver3 = new EdgeDriver();
			driver3.get("https://www.google.com/");
			break;

		default:
			System.err.println("Wrong Choice Entered");
		}
	}

}
