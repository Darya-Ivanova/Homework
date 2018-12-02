package task26.HomeworkTwentySix;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static task26.HomeworkTwentySix.Mail.getUserData;

public class MailruTests extends TestBase {
    private Mail mail;

    @Test(priority = 1)
    public void moveMessageToSpam() {
        mail.moveToSpam();
    }

    @Test(priority = 2)
    public void testNotSpam() {
        mail.markAsNotSpam();
    }

    @Test(priority = 3)
    public void testSendMessageToMultipleReceivers() throws SQLException {
        mail.sentMessage("Test", getUserData().getText(), getUserData().getAddress(), getUserData().getAddress());
    }

    @Test(priority = 4)
    public void testFlags() {
        mail.testCheckbox();
    }
}
