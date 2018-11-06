package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShareMultiple extends  My_SlideBox {
	@Test
	public void sharemultiple() throws Exception{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/']/i")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='root1/sub1/_anchor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='22d096a9-eca9-4173-83f4-ead4f91e0ef5']/td[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='43622ed4-f145-44ad-93d2-5ba8d6aedded']/td[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='crtRoot'][2]")).click();
		}

}
