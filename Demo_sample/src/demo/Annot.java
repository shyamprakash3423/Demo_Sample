package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot {
	@Test
	public void v1(){
		System.out.println("hello");
	}
	@Test
	public void v2(){
		System.out.println("good morning");
	}
	@Test
	public void v3(){
		System.out.println("bye");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("print");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("printout");
	}
	@BeforeClass
	public void Beforeclass(){
		System.out.println("ooffff");
	}
	@AfterClass
	public void Afterclass(){
		System.out.println("yeaahhhhhh");
	}
	@Test(priority=0)
	public void login() {
		System.out.println("jngng");
	}
	@Test(priority=1)
	public void profile(){
		System.out.println("hghgh");
		
	}
	@Test(priority=2)
public void logout(){
	System.out.println("hhh");
}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("kaaree");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("boogu");
	}
}
