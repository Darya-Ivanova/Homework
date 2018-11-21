package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicTestCase {
	public static WebDriver driver;
	
	public WebDriver getWebDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("https://www.booking.com/");
		}
		return driver;
	}
}