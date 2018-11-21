package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Pages{
	
	public MainPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='ss']")
	public WebElement searchCity;
	
	@FindBy(xpath = ".//li [@data-label='Москва, Россия']")
	public WebElement enterCity;
	
	@FindBy(xpath = ".//td [@data-date='2018-12-14']")
	public WebElement enterArrivalDate;
		
	@FindBy(xpath = ".//td [@data-date='2018-12-15']")
	public WebElement enterDepartureDate;
	
	@FindBy(xpath = ".//span [text()='Проверить цены']")
	public WebElement searchButton;

	public void enterCityName() {
		searchCity.sendKeys("Москва");
		enterCity.click();
    }
	
	public HotelsFoundPage enterDate() {
		enterArrivalDate.click();
		enterDepartureDate.click();
		searchButton.click();
		HotelsFoundPage hotelsFoundPage = PageFactory.initElements(driver, HotelsFoundPage.class);
		return hotelsFoundPage;
    }
}
