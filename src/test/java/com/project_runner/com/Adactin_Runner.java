package com.project_runner.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base_class.com.Base_Class;

public class Adactin_Runner extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws  InterruptedException, IOException {

		driver = browser_Confguration("chrome");
		getUrl("https://adactinhotelapp.com/index.php");

		// login
		WebElement username = driver.findElement(By.id("username"));
		sendValue(username, "manoranjith");
		WebElement pass = driver.findElement(By.id("password"));
		sendValue(pass, "123456789");
		WebElement login = driver.findElement(By.id("login"));
		clickable(login);
		// hotel selection
		// location
		WebElement location = driver.findElement(By.id("location"));
		dropdown("byValue", location, "Sydney");
		// hotel
		WebElement hotel = driver.findElement(By.id("hotels"));
		dropdown("byValue", hotel, "Hotel Creek");
		// room
		WebElement room = driver.findElement(By.id("room_type"));
		dropdown("byValue", room, "Double");
		// no. of rooms
		WebElement nosroom = driver.findElement(By.id("room_nos"));
		dropdown("byValue", nosroom, "3");
		// checkin date
		WebElement indate = driver.findElement(By.id("datepick_in"));
		sendValue(indate, "25/02/2022");
		// checkout date
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		sendValue(outdate, "27/02/2022");
		// adult per room
		WebElement apr = driver.findElement(By.id("adult_room"));
		dropdown("byValue", apr, "3");
		// child per room
		WebElement cpr = driver.findElement(By.id("child_room"));
		dropdown("byValue", cpr, "2");
		// submit
		WebElement sub = driver.findElement(By.id("Submit"));
		clickable(sub);
		WebElement rbtn = driver.findElement(By.xpath("//input[@type='radio']"));
		clickable(rbtn);
		WebElement con = driver.findElement(By.id("continue"));
		clickable(con);
		// booking page
		WebElement firstname = driver.findElement(By.id("first_name"));
		sendValue(firstname, "Mano");
		WebElement lastname = driver.findElement(By.id("last_name"));
		sendValue(lastname, "Ranjith");
		WebElement address = driver.findElement(By.name("address"));
		sendValue(address, "porur,Chennai");
		// card details
		WebElement ccnum = driver.findElement(By.name("cc_num"));
		sendValue(ccnum, "1223334444555556");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		dropdown("byValue", cctype, "VISA");
		WebElement ccmonth = driver.findElement(By.name("cc_exp_month"));
		dropdown("byText", ccmonth, "July");
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		dropdown("byValue", ccyear, "2022");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		sendValue(cvv, "123");
		WebElement booknw = driver.findElement(By.id("book_now"));
		booknw.click();
		clickable(booknw);

		Thread.sleep(5000);

		// Screenshot
		screenshotcap(
				"C:\\\\Users\\\\Mano Ranjith\\\\eclipse-workspace\\\\SDET\\\\Screenshot\\\\bookingconfirmation.png");
		// logout
		WebElement logout = driver.findElement(By.xpath("//input[@value='Logout']"));
		clickable(logout);

	}

}
