package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void helloWorld() {
		System.out.println("test2-hello-world");
	}

	@Parameters({"url"})
	@Test
	public void printUrl(String url) {
		System.out.println("test2 - Provided URL: " + url);
	}
}
