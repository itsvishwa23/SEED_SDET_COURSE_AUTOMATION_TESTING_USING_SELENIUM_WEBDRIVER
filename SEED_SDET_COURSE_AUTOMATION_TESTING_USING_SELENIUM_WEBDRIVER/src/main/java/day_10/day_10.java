package day_10;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class day_10 {

	WebDriver driver;
	WebDriver d;

	day_10(WebDriver driver) {

		d = driver;

	}

	public void login_btn_check() throws Exception {

		System.out.println("In login Button");

		FileInputStream fs = new FileInputStream("D:\\DemoFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
	}

}