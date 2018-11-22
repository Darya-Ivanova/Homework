package pages;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class MailruSteps {
    public WebDriver getWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    private static final String LOGIN = "DashaIvanovaV";
    private static final String PASSWORD = "jRZ6QU6zeE8DxF2";
    private WebDriver driver;
    private MainPage mainPage = PageFactory.initElements(getWebDriver(), MainPage.class);

    private MessagePage messagePage = PageFactory.initElements(getWebDriver(), MessagePage.class);

    @Given("^I am on main application page$")
    public void loadMainPage() {
        driver.get("http://mail.ru");
    }

    @When("^I login as correct user$")
    public void loginAsCorrectUser() {
        mainPage.enterLoginAndPassword(LOGIN, PASSWORD);
    }

    @When("^I move messages to spam$")
    public void moveMessagesToSpam(){
        messagePage.moveToSpam();
    }

    @When("^I mark messages as not spam$")
    public void markMessagesAsNotSpam(){
        messagePage.markAsNotSpam();
    }

    @When("^I am sending a message")
    public void sendingAMessage(){
        messagePage.sentMessage("Test", "La la la", "DashaIvanovaV@mail.ru", "DashaIvanovaV@mail.ru");
    }

    @When("^I mark messages with flags$")
    public void markMessagesWithFlags(){
        messagePage.testCheckbox();
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
