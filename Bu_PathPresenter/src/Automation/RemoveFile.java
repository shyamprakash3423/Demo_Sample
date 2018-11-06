package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RemoveFile extends My_SlideBox{
	@Test
public void removefile() throws Exception{
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='amaresh/_anchor']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='62C5474F-DF1F-4394-A1F5-8CC22CA11E74']/td[1]/input")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='62C5474F-DF1F-4394-A1F5-8CC22CA11E74']/td[12]/a[6]/i")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='rename']")).click();
}
}
