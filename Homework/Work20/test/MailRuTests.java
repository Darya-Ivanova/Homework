package test;

import org.testng.annotations.Test;

public class MailRuTests extends TestBase {
	@Test(priority = 1)
    public void moveMessageToSpam() {
		mailru.moveToSpam();
    }

    @Test(priority = 2)
    public void testNotSpam() {
    	mailru.markAsNotSpam();
    }

    @Test(priority = 3)
    public void testSendMessageToMultipleReceivers() {
    	mailru.sentMessage("Test", "La la la", "DashaIvanovaV@mail.ru", "DashaIvanovaV@mail.ru",
                "DashaIvanovaV@mail.ru");
    }
    
    @Test(priority = 4)
    public void testFlags() {
    	mailru.testCheckbox();
    }
}
