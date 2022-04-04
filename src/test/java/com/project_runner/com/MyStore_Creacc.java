package com.project_runner.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base_class.com.Base_Class;

public class MyStore_Creacc extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = browser_Confguration("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		WebElement logbt = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		clickable(logbt);
		
		WebElement emailcrea = driver.findElement(By.id("email_create"));
		sendValue(emailcrea, "qwertyuiop1102@gmail.com");
		
		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		clickable(submit);

		implicitwait(10, TimeUnit.SECONDS);

		WebElement mr = driver.findElement(By.id("uniform-id_gender1"));
		clickable(mr);

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		sendValue(firstname, "Mano");

		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		sendValue(lastname, "Ranjith");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		sendValue(pass, "123456789");
		
		WebElement days = driver.findElement(By.id("days"));
		dropdown("byValue",days, "13");
		
		WebElement months = driver.findElement(By.id("months"));
		dropdown("byText", months, "7");
		
		WebElement years = driver.findElement(By.id("years"));
		dropdown("byIndex", years, "1994");
		
		WebElement newscheck = driver.findElement(By.id("newsletter"));
		clickable(newscheck);
		
		WebElement offercheck = driver.findElement(By.id("optin"));
		clickable(offercheck);
		
		WebElement compname = driver.findElement(By.id("company"));
		sendValue(compname, "Green Technologies");
		
		WebElement address = driver.findElement(By.id("address1"));
		sendValue(address, "250/360,Porur main road");
		
		WebElement add2 = driver.findElement(By.id("address2"));
		sendValue(add2, "Porur");
		
		WebElement city = driver.findElement(By.id("city"));
		sendValue(city, "Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		dropdown("byValue",state, "11");
		
		WebElement pincode = driver.findElement(By.id("postcode"));
		sendValue(pincode, "00000");
		
		WebElement country = driver.findElement(By.id("id_country"));
		dropdown("byValue", country, "21");
		
		WebElement phone = driver.findElement(By.id("phone_mobile"));
		sendValue(phone, "7550162118");
		
		WebElement submitreg = driver.findElement(By.id("submitAccount"));
		clickable(submitreg);
		
		WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickable(signout);

	}

}
