package TestBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
}
