package test;
import org.openqa.selenium.support.PageFactory;
import page.HotelsFoundPage;
import page.MainPage;
import org.testng.annotations.Test;

public class BookingTests extends BasicTestCase {
	
	public MainPage mainPage = PageFactory.initElements(getWebDriver(), MainPage.class);
	public HotelsFoundPage hotelsFoundPage; 

	@Test//(priority = 1)
	public void testEnterCityName() {
		mainPage.enterCityName();
	}

	@Test//(priority = 2)
	public void testEnterDate() {
		hotelsFoundPage = mainPage.enterDate();
	}

	@Test
	public void testHotelSearch() {
		hotelsFoundPage.sortingHotelsByRating();
		hotelsFoundPage.openingLinksOfTheFirstHotel();
		hotelsFoundPage.checkHotelRating();
	}
}
