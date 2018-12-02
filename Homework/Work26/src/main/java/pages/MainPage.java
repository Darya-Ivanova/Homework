package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Pages {
    public MainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@id='mailbox:login']")
    public WebElement enterLogin;

    @FindBy(xpath = ".//input[@id='mailbox:password']")
    public WebElement enterPassword;

    @FindBy(xpath = ".//input[@value='Войти']")
    public WebElement buttonEnter;

    public void openSite(String url) {
        driver.get(url);
    }
}
