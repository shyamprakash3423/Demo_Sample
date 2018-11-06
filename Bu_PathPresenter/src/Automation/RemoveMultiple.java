package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class RemoveMultiple extends My_SlideBox{
	public void removemultiple() throws Exception{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/']/i")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/sub1/_anchor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='43622ed4-f145-44ad-93d2-5ba8d6aedded']/td[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='cc205d64-166a-46b0-9bf8-5c34279b28aa']/td[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@id='crtSub']/i)[2]")).click();
	}

}
