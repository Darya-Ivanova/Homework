package page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelsFoundPage extends Pages{
	
	public HotelsFoundPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath = ".//a[@data-category='review_score_and_price']")
	public WebElement hotelRating;
	
	@FindBy(xpath = "(.//a[@class='hotel_name_link url'])[1]")
	public WebElement openLink;
	
	@FindBy(xpath = "(.//div[@class='bui-review-score__badge'])[1]")
	public WebElement rating;	
	
	@FindBy(xpath = "//*[@id=\"utag_59_iframe\"]")
	public WebElement notificationOne;
	
	@FindBy(xpath = ".//div[@class='sr-usp-overlay sr-usp-overlay--wide']")
	public WebElement notificationTwo;
 
    public void sortingHotelsByRating() {
    	hotelRating.click();
    	(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
    }
    
    public void openingLinksOfTheFirstHotel() {
    	openLink.click();
    }
    
    public void checkHotelRating() {
    	double minimumRating = 9.0;
		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(handles.size() - 1));
		System.out.println("Is the minimum rating greater than 9? "
				+ (Double.parseDouble(rating.getText().trim()) >= minimumRating ? "Yes!" : "No!"));
    }


}
