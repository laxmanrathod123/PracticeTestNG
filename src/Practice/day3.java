package Practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test(enabled=false)
	public void weblogincarloan() {
		System.out.println("I am in weblogincarloan ");
	}

	@Test(groups = { "Smoke" })
	public void Mobilelogin() {
		System.out.println("I am in Mobilelogincarloan ");
	}

	@AfterSuite
	public void aftersuiteMethod() {
		System.out.println("I am in the aftersuit method and I will execute last ");

	}
	
	@Test(dependsOnMethods= {"zxamle"})
	public void Afirstmethod() {
		System.out.println("first method in the class");
		
	}
	@Test
	public void zxamle() {
		System.out.println("last method in the class");
		
	}
}
