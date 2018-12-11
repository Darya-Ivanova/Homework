package pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestMailru extends TestBase {
    public MainPage mainPage = PageFactory.initElements(getWebDriver(), MainPage.class);
    public MessagesPage messagesPage;

    @Given("^I login as correct user$")
    @Test(priority = 1)
    public void testEnterLoginAndPassword() throws SQLException {
        messagesPage = mainPage.enterLoginAndPassword("DashaIvanovaV","jRZ6QU6zeE8DxF2");
 //       messagesPage = mainPage.enterLoginAndPassword(getUserData().getLogin(), getUserData().getPassword());
    }
    @Given("^I will move the message to spam$")
    @Test(priority = 2)
    public void testMoveMessageToSpam() {
        messagesPage.moveToSpam();
    }

    @Test(priority = 3)
    public void testNotSpam() {
        messagesPage.markAsNotSpam();
    }

    @When("^I will send a message to any user$")
    @Test(priority = 4)
    public void testSendMessageToMultipleReceivers() {
        messagesPage.sentMessage("Test", "La la la", "DashaIvanovaV@mail.ru");
    }

    @Then("^I close the site$")
    @Test(priority = 5)
    public void closeProject() {
        driver.close();
    }
}
