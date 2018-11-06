package Automation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SharingFile extends My_SlideBox{
	@Test
public void share() throws Exception{
	System.out.println("My slide box page should be opened");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='#Shared/']/i")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='root1/']/i")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='root1/sub1/_anchor']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='22d096a9-eca9-4173-83f4-ead4f91e0ef5']/td[1]/input")).click();
	System.out.println("Share page should open");
	driver.findElement(By.xpath(".//*[@id='22d096a9-eca9-4173-83f4-ead4f91e0ef5']/td[12]/a[2]/i")).click();
	ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(tab.size());
	for (int i = 0; i < tab.size(); i++) {
		driver.switchTo().window(tab.get(i));
		System.out.println(driver.getCurrentUrl());	
	}
Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='txtFileName']")).sendKeys("Test");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	System.out.println("Enter the email");
	driver.findElement(By.xpath(".//*[@id='txtEmail']")).sendKeys("shyamprakashtesting@gmail.com");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='datetimepicker1']/span[2]/button")).click();
	System.out.println("Email shared");
	System.out.println("For Goup Share");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/div[4]/button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='17458d0e-dd99-489f-a47a-bc46700fb7a0']/td[2]/a/i")).click();
	System.out.println("Email Shared in Group");
	
}
}
