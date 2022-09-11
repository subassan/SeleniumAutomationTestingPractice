package TestBrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\webdrivers\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
	}
}
