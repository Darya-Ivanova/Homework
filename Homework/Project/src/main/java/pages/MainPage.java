package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {
    public MainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private static final Logger logger = Logger.getLogger(MainPage.class);

    @FindBy(xpath = ".//input[@id='mailbox:login']")
    public WebElement enterLogin;

    @FindBy(xpath = ".//input[@id='mailbox:password']")
    public WebElement enterPassword;

    @FindBy(xpath = ".//input[@value='Войти']")
    public WebElement buttonEnter;

    public MessagesPage enterLoginAndPassword(String email, String password) {
        enterLogin.sendKeys(email);
        logger.info("Ввели логин");
        enterPassword.sendKeys(password);
        logger.info("Ввели пароль");
        buttonEnter.click();
        MessagesPage messagesPage = PageFactory.initElements(driver, MessagesPage.class);
        return messagesPage;
    }
}
