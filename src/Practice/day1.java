package Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {

	
	@AfterTest
	public void AtLast() {
		System.out.println("I will execute at last");
	}
	@Test(groups={"Smoke"})
	public void test() {
		System.out.println("I am in test");
	}
	@BeforeSuite
	public void suitemethod() {
		System.out.println("I am in the suite method and I will execute first");
	}
	public void Demo() {
		System.out.println("I am in demo");
	}
	
	@BeforeTest
	public void Prequisite() {
		System.out.println("I will execute first");
	}
	@Parameters({ "URL" })
	@Test
	public void Prarameters(String url) {
		System.out.println("I am in parameters method");
		System.out.println(url);
	}
}
