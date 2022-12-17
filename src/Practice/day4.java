package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
  
	@BeforeClass
	public void beforeclassblock() {
		System.out.println(" I am beforeclass method annotation execute first before all method ");
	}
	@Test
	public void webloginHomeLoan () {
		System.out.println("I am in webloginHomeLoan");
	}
	@BeforeMethod
	public void beforemethodblock() {
		System.out.println("I am in beforemethod block and will execute before all the method present in the class");
	}
	@AfterMethod
	public void aftermethoblock() {
		System.out.println("I will execute after the every test method is executed ");
	}
	@Test
	public void Mobilelogin () {
		System.out.println("I am in MobileloginHomeLoan");
	}
	@AfterClass
	public void afterclassblock() {
		System.out.println(" I am afterclass method annotation execute first before all method ");
	}
	@Test
	public void apilogin () {
		System.out.println("I am in apiloginHomeLoan");	
	}
}
