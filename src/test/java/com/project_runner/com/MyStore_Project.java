package com.project_runner.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base_class.com.Base_Class;

public class MyStore_Project extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

	    driver = browser_Confguration("chrome");

		getUrl("http://automationpractice.com/index.php");

		WebElement logbt = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
		clickable(logbt);
		
		WebElement email = driver.findElement(By.id("email"));
		sendValue(email, "qwertyuiop1102@gmail.com");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		sendValue(pass, "123456789");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clickable(login);
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickable(tshirts);
		
		WebElement product = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		clickable(product);
		
        implicitwait(10,TimeUnit.SECONDS);
		
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame1);

		WebElement inc = driver.findElement(By.xpath("//a[@class = 'btn btn-default button-plus product_quantity_up']"));
		clickable(inc);
		
		WebElement bluecolor = driver.findElement(By.id("color_14"));
		clickable(bluecolor);
		
		WebElement addtocart = driver.findElement(By.name("Submit"));
		clickable(addtocart);
		
		driver.switchTo().defaultContent();

		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickable(checkout);
		
		WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickable(checkout2);
		
		WebElement addcomm = driver.findElement(By.name("message"));
		sendValue(addcomm, "Thank you for the Service");
		
		WebElement checkout3 = driver.findElement(By.name("processAddress"));
		clickable(checkout3);
		
		WebElement checkbox = driver.findElement(By.name("cgv"));
		clickable(checkbox);
		
		WebElement paybycheck = driver.findElement(By.name("processCarrier"));
		clickable(paybycheck);
		
		WebElement subm = driver.findElement(By.xpath("(//p[@class='payment_module'])[2]"));
		clickable(subm);
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickable(confirm);
		
		WebElement account = driver.findElement(By.xpath("//a[@class='account']"));
		clickable(account);
		
		WebElement orders = driver.findElement(By.xpath("//a[@title='Orders']"));
		clickable(orders);
		
		Thread.sleep(3000);

		screenshotcap("C:\\Users\\Mano Ranjith\\eclipse-workspace\\Sel_Mav-Prjt\\Screenshot");

		WebElement logout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickable(logout);
	}

}
