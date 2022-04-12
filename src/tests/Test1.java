package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void helloWorld() {
		System.out.println("test1-hello-world");
	}

	@Parameters({"url"})
	@Test
	public void printUrl(String url) {
		System.out.println("test1 - Provided URL: " + url);
	}
}
