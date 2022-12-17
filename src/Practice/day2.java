package Practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"Smoke"})
	public void day() {
		System.out.println("I am in day method");
		Assert.assertTrue(false);
	}
	@Test(dataProvider="getData")
	public void dataclass(String username, String password) {
		System.out.println("I am here to get data from dataProvider");
		System.out.println(username);
		System.out.println(password  );
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] ar= new Object[3][2];
		ar[0][0]="firstusername";
		ar[0][1]="firstpassword";
		
		ar[1][0]="secondusername";
		ar[1][1]="secondpassword";
		
		ar[2][0]="thirdusername";
		ar[2][1]="thirdpassword";
		return ar;
	}

}
