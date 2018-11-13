package pack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");

		WebElement searchCity = driver.findElement(By.xpath(".//*[@id='ss']"));
		searchCity.sendKeys("Москва");

		Thread.sleep(3000);

		WebElement enterCity = driver.findElement(By.xpath(".//li [@data-label='Москва, Россия']"));
		enterCity.click();

		WebElement enterArrivalDate = driver.findElement(By.xpath(".//td [@data-date='2018-12-14']"));
		enterArrivalDate.click();

		WebElement enterDepartureDate = driver.findElement(By.xpath(".//td [@data-date='2018-12-15']"));
		enterDepartureDate.click();

		WebElement searchButton = driver.findElement(By.xpath(".//span [text()='Проверить цены']"));
		searchButton.click();

		ArrayList<WebElement> searchhotelList = new ArrayList<>(
				driver.findElements(By.xpath(".//span[@class[contains(.,'sr-hotel__name')]]")));
		System.out.println("Hotels found? " + (searchhotelList.size() != 0 ? "Yes!" : "No!"));

		WebElement hotelRating = driver.findElement(By.xpath(".//a[@data-category='review_score_and_price']"));
		hotelRating.click();

		Thread.sleep(3000);

		WebElement openLink = driver.findElement(By.xpath("(.//a[@class='hotel_name_link url'])[1]"));
		openLink.click();

		double minimumRating = 9.0;
		ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(handles.size() - 1));
		WebElement rating = driver.findElement(By.xpath("(.//div[@class='bui-review-score__badge'])[1]"));
		System.out.println("Is the minimum rating greater than 9? "
				+ (Double.parseDouble(rating.getText().trim()) >= minimumRating ? "Yes!" : "No!"));
	}
}
