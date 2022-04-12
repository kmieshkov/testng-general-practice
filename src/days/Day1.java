package days;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@BeforeMethod(enabled = false) // skip test from execution
	public void beforeMethod() {
		System.out.println("-day1-execute-before-each-method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("day1--------before-test");
	}

	@Test
	public void hello() {
		System.out.println("day1-hello");
	}

	@Test(dependsOnMethods = {"hello", "world"}) // will be executed after hello and after world methods
	public void bye() {
		System.out.println("day1-bye");
	}

	@Test(timeOut = 5000)// this block will wait 5sec before throwing an error if it fails
	public void world() {
		System.out.println("day1-world");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("day1--------after-test");
	}

	@Test(groups = {"smoke"})
	public void smoke() {
		System.out.println("day1-smoke-test");
	}
}