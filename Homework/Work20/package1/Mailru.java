package package1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MainPage;
import pages.MessagePage;

public class Mailru {
	private WebDriver driver;

    private MainPage mainPage;
    private MessagePage messagePage;


    public Mailru() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        messagePage = new MessagePage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void openMainPage(String url) {
        mainPage.openSite(url);
    }

    public void enterLoginAndPassword(String email, String password) {
        mainPage.enterLogin.sendKeys(email);
        mainPage.enterPassword.sendKeys(password);
        mainPage.buttonEnter.click();
    }

    public void moveToSpam() {
        messagePage.selectFirstCheckbox.click();
        messagePage.spamButton.click();
        messagePage.buttonToConfirmMovementToSpam.click();
    }

    public void markAsNotSpam() {
    	messagePage.leftSpamButton.click();
    	messagePage.selectFirstCheckbox.click();
        messagePage.notSpamButton.click();
    }

    public void sentMessage(String subject, String text, String...receivers) {
    	messagePage.writeLetter.click();
        for (String receiver : receivers) {
        	messagePage.enterEmail.sendKeys(receiver + ",");
        }
        messagePage.enterTheSubjectLine.sendKeys(subject);
        messagePage.enterMessage(text);
        messagePage.sendButton.click();
    }
    
    public void testCheckbox() {
    	messagePage.inboxButton.click();
    	messagePage.selectAllMessages.click();
    	messagePage.selectAllMessages.click();
    }
}