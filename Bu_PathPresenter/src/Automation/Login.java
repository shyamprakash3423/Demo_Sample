package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	WebDriverWait wait;
	WebDriver driver;
	@Test
	public void login()throws Exception{
	System.setProperty("webdriver.firefox.marionette", "D:\\shyam\\Set ups\\geckodriver.exe");
	driver = new FirefoxDriver();
	System.out.println("Browser should open");
	driver.get("https://bu.pathpresenter.net");
	driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("ppdev1@gmail.com");
	driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("ppdev1@gmail");
	driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(Keys.ENTER);
	System.out.println("Login Completed");
	
	}
}
