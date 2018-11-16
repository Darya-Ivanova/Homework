package pack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paris2 {

	private static Date addDays(Date date, int daysToAdd) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, daysToAdd);
		return calendar.getTime();
	}

	private static String dateFormat(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormat.format(date);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.booking.com");

		WebElement searchCity = driver.findElement(By.xpath(".//*[@id='ss']"));
		searchCity.sendKeys("Париж");

		WebElement enterCity = driver.findElement(By.xpath(".//li [@data-label='Париж, Иль-де-Франс, Франция']"));
		enterCity.click();

		Date date = new Date();
		Date date1 = addDays(date, 3);
		Date date2 = addDays(date1, 7);

		String stringDate1 = dateFormat(date1);
		String stringDate2 = dateFormat(date2);

		String dateLocator = ".// td [@data-date='%s']";

		WebElement dateFrom = driver.findElement(By.xpath(String.format(dateLocator, stringDate1)));
		dateFrom.click();

		WebElement dateTo = driver.findElement(By.xpath(String.format(dateLocator, stringDate2)));
		dateTo.click();

		WebElement enteringPeopleAndRooms = driver.findElement(By.xpath(".//div [@data-visible='accommodation,flights,cruises']"));
		enteringPeopleAndRooms.click();
				
		WebElement enteringAdults = driver.findElement(By.xpath(".//select [@name='group_adults']"));
		Select selectAdults = new Select(enteringAdults);
		selectAdults.selectByIndex(3);
		
		WebElement enterintRooms = driver.findElement(By.xpath(".//select [@name='no_rooms']"));
		Select selectRooms = new Select(enterintRooms);
		selectRooms.selectByIndex(1);

		WebElement searchButton = driver.findElement(By.xpath(".//span [text()='Проверить цены']"));
		searchButton.click();

		WebElement hotelRating = driver.findElement(By.xpath(".//a[@data-category='review_score_and_price']"));
		hotelRating.click();
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
		
		int maxCostPerWeek = 1610;
		WebElement price = driver.findElement(By.xpath("//*[@id=\"filter_price\"]/div[2]/a[4]"));
		price.click();

		List<WebElement> prices = driver.findElements(By.xpath(
				".//* [@class='js_rackrate_animation_anchor smart_price_style gray-icon  b_bigger_tag   animated']/strong/b"));
		List<String> stringPrices = new ArrayList();
		for (WebElement element : prices) {
			stringPrices.add(element.getText());
		}
		List<Integer> intPrices = new ArrayList();
		for (String s : stringPrices) {
			String forInt = s.replace("BYN ", "");
			forInt = forInt.replaceAll(" ", "");
			intPrices.add(Integer.parseInt(forInt));
		}

		int minPrice = intPrices.get(0);
		for (int i = 0; i < intPrices.size(); i++) {
			if (intPrices.get(i) < minPrice) {
				minPrice = intPrices.get(i);
			}
		}
		System.out.println("The lowest price of the proposed hotels: " + minPrice);
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
		
		String priceLocator = ".//a [@class='hotel_name_link url']";
		WebElement hotel = driver.findElement(By.xpath(String.format(priceLocator, minPrice)));
		hotel.click();
		
		boolean flag = false;
		for (int i = 0; i < intPrices.size(); i++) {
			if (intPrices.get(i) > maxCostPerWeek) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("A superior price has been found. ");
		} else {
			System.out.println("A superior price did NOT found. ");
		}
		
		driver.switchTo().window(".//a [@class='hotel_name_link url']");
		
		WebElement roomReservation = driver.findElement(By.xpath(".//button [@data-title='Забронировать этот хостел']"));
		roomReservation.click();
		
		WebElement selectOfBeds = driver.findElement(By.xpath("//*[@id=\"hprt-form\"]/table/tbody/tr[1]/td[5]/div/label/select"));
		Select selectBed = new Select(selectOfBeds);
		selectBed.selectByIndex(2);
				
		WebElement pressButtonReservation = driver.findElement(By.xpath(".//button [@data-title='Сначала выберите вариант']"));
		pressButtonReservation.click();
	}

}
