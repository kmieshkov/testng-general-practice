package days;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void demo() {
		System.out.println("day2-demo");
		Assert.assertTrue(false);
	}

	@Test(groups = {"smoke"})
	public void smoke() {
		System.out.println("day2-smoke-test");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		//1st set
		data[0][0] = "username1";
		data[0][1] = "password1";

		//2nd set
		data[1][0] = "username2";
		data[1][1] = "password2";

		//3rd set
		data[2][0] = "username3";
		data[2][1] = "password3";

		return data;
	}

	@Test(dataProvider = "getData")
	public void printData(String username, String password) {
		System.out.println(username + " " + password);
	}
}
