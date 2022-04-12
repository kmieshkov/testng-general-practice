package days;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("day3===========before-suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("day3===========after-suite");
	}

	@Test
	public void webLoginHome() {
		//selenium
		System.out.println("day3-selenium-login");
	}

	@Test
	public void mobileLoginHome() {
		//appium
		System.out.println("day3-appium-login");
	}

	@Test
	public void mobileLogout() {
		//appium
		System.out.println("day3-appium-logout");
	}

	@Test
	public void mobileDemo() {
		//appium
		System.out.println("day3-appium-demo");
	}

	@Parameters({"url", "APIkey"})
	@Test
	public void APILoginHome(String url, String key) {
		//API
		System.out.println("day3-API-login");
		System.out.println("day3 - URL: " + url + " API key: " + key);
	}

	@Test(groups = {"smoke"})
	public void smoke() {
		System.out.println("day3-smoke-test");
	}
}
