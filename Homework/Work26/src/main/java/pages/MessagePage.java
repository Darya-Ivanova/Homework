package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage extends Pages {
    public MessagePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//a[@data-name='link' and not(ancestor::div[contains(@style, 'display: none;')])]")
    public List<WebElement> carrentMessages;

    @FindBy(xpath = "(.//div[contains(@class, 'b-checkbox__box')])[1]")
    public WebElement selectAllMessages;

    @FindBy(xpath = "(.//div[contains(@class, 'checkbox__box') and  not(ancestor::div[contains(@style, 'display: none;')]) and ancestor::div[@id='b-letters']])[1]")
    public WebElement selectFirstCheckbox;

    @FindBy(xpath = "(.//div[@data-name='spam'])[1]")
    public WebElement spamButton;

    @FindBy(xpath = "((.//div [@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_ b-toolbar__item_false b-toolbar__item_adaptive b-toolbar__item_adaptive_msgl-high b-toolbar__item_false'])[2]")
    public WebElement notSpamButton;

    @FindBy(xpath = ".//*[@id=\"b-nav_folders\"]/div/div[4]")
    public WebElement leftSpamButton;

    @FindBy(xpath = ".//div[@id='b-nav_folders']//span[text()='Входящие']")
    public WebElement inboxButton;

    @FindBy(xpath = ".//div [@class='b-layer__container']']")
    public WebElement notification;

    @FindBy(xpath = ".//button [@data-bem='btn']/*[text()='Да, перемещать']")
    public WebElement buttonToConfirmMovementToSpam;

    @FindBy(xpath = "(.//a[@data-name='compose'])[1]")
    public WebElement writeLetter;

    @FindBy(xpath = ".//textarea[@data-original-name='To']")
    public WebElement enterEmail;

    @FindBy(xpath = ".//input[@name='Subject']")
    public WebElement enterTheSubjectLine;

    @FindBy(xpath = ".//iframe")
    public WebElement enterMessageText;

    @FindBy(xpath = "(.//div[@data-name='send'])[1]")
    public WebElement sendButton;

    public void enterMessage(String message) {
        driver.switchTo().frame(enterMessageText);
        driver.findElement(By.xpath("//body")).sendKeys(message);
        driver.switchTo().defaultContent();
    }
}
