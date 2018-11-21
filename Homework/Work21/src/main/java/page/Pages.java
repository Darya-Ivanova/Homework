package page;

import org.openqa.selenium.WebDriver;

public abstract class Pages {
	public WebDriver driver;
	
	public Pages (WebDriver driver) {
		this.driver = driver;
	}
	
	public void hotelSearch() {
	}
}
