package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class My_SlideBox  extends Login{
	@Test
	public void my_slidebox(){
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div")).click();
		System.out.println("My slide box page is opened");
	}
}
