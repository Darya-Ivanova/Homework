package task26.HomeworkTwentySix;

import org.testng.annotations.BeforeMethod;

import java.sql.SQLException;

import static task26.HomeworkTwentySix.Mail.getUserData;

public class TestBase {
    public static ThreadLocal<Mail> tlApp = new ThreadLocal<>();
    public Mail mail;

    @BeforeMethod
    public void start() throws SQLException {
        if (tlApp.get() != null) {
            mail = tlApp.get();
            return;
        }

        mail = new Mail();
        tlApp.set(mail);
        mail.openMainPage("https://mail.ru/");
        mail.enterLoginAndPassword(getUserData().getLogin(),getUserData().getPassword());

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { mail.quit(); mail = null; }));
    }


}
