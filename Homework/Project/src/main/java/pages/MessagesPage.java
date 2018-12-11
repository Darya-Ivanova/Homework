package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MessagesPage extends Page {
    public MessagesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"portal-menu\"]/div[2]/div/div[1]/div[2]/div/span/span[2]/span[1]/a/span[2]")
    public WebElement buttonLetters;

    @FindBy(xpath = "(.//div[contains(@class, 'checkbox__box') and  not(ancestor::div[contains(@style, 'display: none;')]) and ancestor::div[@id='b-letters']])[1]")
    public WebElement selectFirstCheckbox;

    @FindBy(xpath = "(.//div[@data-name='spam'])[1]")
    public WebElement spamButton;

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

    @FindBy(xpath = "//*[@id=\"jsHtml\"]/body/div[1]/div[1]/div/span/a")
    public WebElement notSpamButton;

    public void enterMessage(String message) {
        driver.switchTo().frame(enterMessageText);
        driver.findElement(By.xpath("//body")).sendKeys(message);
        driver.switchTo().defaultContent();
    }

    public void moveToSpam() {
        buttonLetters.click();
        selectFirstCheckbox.click();
        spamButton.click();
        buttonToConfirmMovementToSpam.click();
    }

    public void markAsNotSpam() {
        notSpamButton.click();
    }

    public void sentMessage(String subject, String text, String...receivers) {
        writeLetter.click();
        for (String receiver : receivers) {
            enterEmail.sendKeys(receiver + ",");
        }
        enterTheSubjectLine.sendKeys(subject);
        enterMessage(text);
        sendButton.click();
    }
}
