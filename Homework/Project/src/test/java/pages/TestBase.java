package pages;

        import SQL.MailruData;
        import cucumber.api.java.en.Given;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
//        import java.sql.*;
        import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    private MailruData mailruData;

    public WebDriver getWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.get("https://mail.ru/");
        }
        return driver;
    }
//
//    public static MailruData getUserData() throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/mailru?useSSL=false&serverTimezone=UTC";
//        String user = "root";
//        String userPassword = "mir123456789";
//        String query = "SELECT * FROM mailru.data;";
//        ResultSet resultSet = getResultSet(url, user, userPassword, query);
//        return getUser(resultSet);
//    }
//
//    private static ResultSet getResultSet(String url, String user, String userPassword, String query) throws SQLException {
//        ResultSet resultSet;
//        Connection connection = DriverManager.getConnection(url, user, userPassword);
//        Statement statement = connection.createStatement();
//        resultSet = statement.executeQuery(query);
//        return resultSet;
//    }
//
//    private static MailruData getUser(ResultSet resultSet) throws SQLException {
//        MailruData mailruData = new MailruData();
//        resultSet.next();
//        mailruData.setLogin(resultSet.getString(2));
//        mailruData.setPassword(resultSet.getString(3));
//        mailruData.setText(resultSet.getString(4));
//        mailruData.setAddress(resultSet.getString(5));
//        return mailruData;
//    }
}
