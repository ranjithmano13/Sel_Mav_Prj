package com.base_class.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browser_Confguration(String browser_type) {

		if (browser_type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mano Ranjith\\eclipse-workspace\\Sel_Mav-Prjt\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser_type.equalsIgnoreCase("firefox")) {

		} else if (browser_type.equalsIgnoreCase("internetexplorer")) {

		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String weburl) {

		driver.get(weburl);

	}

	public static void clickable(WebElement element) {

		element.click();

	}

	public static void sendValue(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	public static void dropdown(String type, WebElement element, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

	}
	
	public static void implicitwait(long t, TimeUnit type) {
	driver.manage().timeouts().implicitlyWait(t, type);

	}

	public static void close() {
		driver.close();

	}

	public static void screenshotcap(String filedes) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(filedes);
		FileUtils.copyDirectory(src, des);

	}

}
