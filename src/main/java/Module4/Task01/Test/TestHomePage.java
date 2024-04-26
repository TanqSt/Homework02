package Module4.Task01.Test;
import Module4.Task01.Pages.Home;
import Module4.Task01.Pages.Hooks;
import Module4.Task01.Pages.LoginForm;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.NullPointerException;
import java.time.Duration;

import static Module4.Task01.Pages.Hooks.driver;
public class TestHomePage extends Hooks {
    @Test(priority = 1)
    public void addNewSalesEntries() throws InterruptedException {

        LoginForm.insertUsernameInTheField("maria");
        LoginForm.insertPasswordInTheField("thoushallnotpass");
        LoginForm.pressLoginButton();
        Home.addNewDataEntries("Petar", "Georgiev", "5000", "6000");
        Assert.assertEquals(Home.getActiveSalesPeople(), "1");
    }

    @Test(priority = 2)
    public void PerformanceResult() {

        Home.clickOnShowPerformanceBtn();
        Assert.assertEquals(Home.getTextFromPerfComment(1), "A positive result. Well done!");

    }


    @Test(priority = 3)
    public void deleteAllSalesEntries() {

        Home.clickDelEntries();
        Assert.assertTrue(Home.TableSalesEntries());
        Home.clickOnLogoutButton();

    }
}