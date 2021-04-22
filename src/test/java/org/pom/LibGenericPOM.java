package org.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibGenericPOM {

	static WebDriver driver;

	// method to launch browser
	public WebDriver browserlaunch() {
		// to configure the drivers
		System.setProperty("webdriver.gecko.driver", "E://Eclipse Drivers/geckodriver.exe");

		// to launch the browser
		driver = new FirefoxDriver();
		return driver;
	}

	// method to launch the url
	public void launchurl(String url) {
		driver.get(url);
	}

	// method to enter text in text box
	public void type(WebElement e, String value) {
		e.sendKeys(value);
	}

	// method to click the button

	public void btnclick(WebElement e) {
		e.click();
	}

	// to get the url of the page
	public String getURL() {
		String CurrentUrl = driver.getCurrentUrl();
		return CurrentUrl;

	}

	// to close the browser
	public void quitBrowser() {
		driver.quit();
	}
	
	
		public String excelRead(int rowNo,int ColNo) throws IOException {
			
			

			// to pass the file location
			File f = new File("C:\\Users\\Selvakumar\\eclipse-workspace\\Old Eclipse Version\\maven_basics\\Excel\\POMOutput.xlsx");

			// to read values from excel
			FileInputStream e = new FileInputStream(f);

			Workbook W = new XSSFWorkbook(e);

			Sheet s = W.getSheet("Sheet1");

			 Row r =s.getRow(rowNo);
			
			 Cell c = r.getCell(ColNo);

				int type = c.getCellType();

					String val;
					if (type == 1) {
						// string

						 val = c.getStringCellValue();
						
					} else if (DateUtil.isCellDateFormatted(c)) {
						
						Date d = c.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
						 val = sim.format(d);
						
					} else {
						// number
						
						double d = c.getNumericCellValue();
						
						// Type casting -to convert double to long then to string bcoz we cannot direct
						// convert double to string

						long l = (long) d;

						 val = String.valueOf(l);
						System.out.println(val);
					}
					return val;	

		}
}
		