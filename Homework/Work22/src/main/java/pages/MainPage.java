package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Pages {
	public MainPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input[@id='mailbox:login']")
    public WebElement enterLogin;

    @FindBy(xpath = ".//input[@id='mailbox:password']")
    public WebElement enterPassword;

    @FindBy(xpath = ".//input[@value='Войти']")
    public WebElement buttonEnter;

    public MessagePage enterLoginAndPassword(String login, String password) {
        enterLogin.sendKeys(login);
        enterPassword.sendKeys(password);
        buttonEnter.click();
        MessagePage messagePage = PageFactory.initElements(driver, MessagePage.class);
        return messagePage;
    }
}
