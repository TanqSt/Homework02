package Module4Final.Resource;
import Module4Final.Pages.LoginPage;
import Module4Final.Pages.TransferFunds;
import Module4Final.Resource.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import Module4Final.Pages.AccountCreate;


import java.util.concurrent.TimeUnit;

public class Hooks extends Browsers{
    public static WebDriver driver;
    AccountCreate accountCrPage;
    LoginPage logPage;
    TransferFunds funds;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost:8091/parabank/register.htm");
        this.accountCrPage = new AccountCreate(driver);
        this.logPage=new LoginPage(driver);
        this.funds=new TransferFunds(driver);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}






