package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RootCreation extends My_SlideBox{
	WebDriverWait wait;
	@Test
	public void create_folder() throws Exception{
		System.out.println("creating new root folder");
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("crtRoot")));
		driver.findElement(By.id("crtRoot")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newFolderName")));
		driver.findElement(By.id("newFolderName")).sendKeys("root1");
		driver.findElement(By.xpath(".//*[@id='btnFolderCreate']")).click();
		System.out.println("Root folder created");
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='#Shared/']/i")));
		driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
		driver.findElement(By.id("root1/_anchor")).click();
		System.out.println("Create Sub Folder");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='crtSub'][1]")));
		driver.findElement(By.xpath(".//*[@id='crtSub'][1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='newFolderName1']")));
		driver.findElement(By.xpath(".//*[@id='newFolderName1']")).sendKeys("sub1");
		driver.findElement(By.xpath(".//*[@id='btnFolderSubCreate']")).click();
		System.out.println("Subfolder created");
}
}