package Module4.Task01.Pages;
import Module4.Task01.Custom.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import Module4.Task01.Pages.Home;
import Module4.Task01.Pages.LoginForm;
import Module4.Task01.Custom.Browsers;

import java.util.concurrent.TimeUnit;

public class Hooks extends Browsers {
   public static WebDriver driver;
     Home homePage;
     LoginForm LoginPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://robotsparebinindustries.com/");
        this.homePage = new Home(driver);
        this.LoginPage = new LoginForm(driver);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}

