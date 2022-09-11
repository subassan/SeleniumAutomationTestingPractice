package TestBrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class MSEdge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\webdrivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
	}
}
