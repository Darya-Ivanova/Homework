package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class Pages {
	protected WebDriver driver;
	protected Wait<WebDriver> fluentWait;

	public Pages(WebDriver driver) {
		this.driver = driver;
	}
}
