package TestBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\webdrivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
	}
}
