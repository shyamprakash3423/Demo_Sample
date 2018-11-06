package Automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Uploadingfiles extends  My_SlideBox {
	@Test
	public void upload()throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/']/i")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/sub1/_anchor']")).click();
		System.out.println("Upload files");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='uploadLink']/i")).click();
		System.out.println("Browse window should be opened");
		ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tab.size());
		for (int i = 0; i < tab.size(); i++) {
			driver.switchTo().window(tab.get(i));
			System.out.println(driver.getCurrentUrl());	
		}
		driver.switchTo().window(tab.get(1));
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath(".//*[@id='files']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		System.out.println("New Upload window should be opened");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='txtcasetitle']")).sendKeys("23");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='uploadfilestocloud']")).click();
		
	}

}
