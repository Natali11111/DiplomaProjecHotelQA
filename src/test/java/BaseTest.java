import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//импортировать свой класс
import utils.DriverManager;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static WebDriver driver;
    private String url = "http://localhost:8080/article/";

    @BeforeTest
    public void beforeClass() {
        driver = DriverManager.getInstance().createWebDriver().getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(url);
    }

    @AfterMethod
    public void afterMethod() {
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void afterClass() {
        driver.close();
    }
}
