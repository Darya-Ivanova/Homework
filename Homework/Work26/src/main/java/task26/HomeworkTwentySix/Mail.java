package task26.HomeworkTwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.MessagePage;

public class Mail {
	private WebDriver driver;

	private MainPage mainPage;
	private MessagePage messagePage;
	private MailruData mailruData;

	public Mail() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		mainPage = new MainPage(driver);
		messagePage = new MessagePage(driver);
	}

	public static MailruData getUserData() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/mailru?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String userPassword = "mir123456789";
		String query = "SELECT * FROM mailru.data;";
		ResultSet resultSet = getResultSet(url, user, userPassword, query);
		return getUser(resultSet);
	}

	private static ResultSet getResultSet(String url, String user, String userPassword, String query) throws SQLException {
		ResultSet resultSet = null;
		Connection connection = DriverManager.getConnection(url, user, userPassword);
		Statement statement = connection.createStatement();
		resultSet = statement.executeQuery(query);
		return resultSet;
	}

	private static MailruData getUser(ResultSet resultSet) throws SQLException {
		MailruData mailruData = new MailruData();
		resultSet.next();
		mailruData.setId(resultSet.getString(1));
		mailruData.setLogin(resultSet.getString(2));
		mailruData.setPassword(resultSet.getString(3));
		mailruData.setText(resultSet.getString(4));
		mailruData.setAddress(resultSet.getString(5));
		return mailruData;
	}

	public void quit() {
		driver.quit();
	}

	public void openMainPage(String url) {
		mainPage.openSite(url);
	}

	public void enterLoginAndPassword(String login, String password) throws SQLException {
		mainPage.enterLogin.sendKeys(getUserData().getLogin());
		mainPage.enterPassword.sendKeys(getUserData().getPassword());
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

