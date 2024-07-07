package day_1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opening_Browser_Using_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		System.out.println("Enter your choice");
		System.out.println("1: Firefox");
		System.out.println("2: Chrome");
		System.out.println("3: Edge");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		if (choice == 1) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");

		} else if (choice == 2) {

			WebDriver driver_2 = new ChromeDriver();
			driver_2.get("https://www.google.com/");

		}

		else if (choice == 3) {

			WebDriver driver_3 = new EdgeDriver();
			driver_3.get("https://www.google.com/");

		}
		else {
			System.err.println("Wrong Choice Entered");



		}


	}

}
