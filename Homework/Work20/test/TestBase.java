package test;
import org.testng.annotations.BeforeMethod;
import package1.Mailru;

public class TestBase {
	 public static ThreadLocal<Mailru> tlApp = new ThreadLocal<>();
	    public Mailru mailru;

	    @BeforeMethod
	    public void start() {
	        if (tlApp.get() != null) {
	        	mailru = tlApp.get();
	            return;
	        }

	        mailru = new Mailru();
	        tlApp.set(mailru);
	        mailru.openMainPage("https://mail.ru/");
	        mailru.enterLoginAndPassword("DashaIvanovaV","jRZ6QU6zeE8DxF2");

	        Runtime.getRuntime().addShutdownHook(
	                new Thread(() -> { mailru.quit(); mailru = null; }));
	    }

}
