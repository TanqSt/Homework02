package Module4Final.Tests;
import Module4Final.Pages.LoginPage;
import Module4Final.Pages.AccountCreate;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static Module4Final.Resource.Hooks.driver;
import java.lang.NullPointerException;


/**
 * Test Scenario: Validate successful user login with valid credentials

 * 1. Navigate to the login page
 * 2. Enter correct username and password
 * 3. Submit the login form
 * Expected Outcome:
 * - A success message should be displayed indicating successful login.
 */

public class TestLogin extends Module4Final.Resource.Hooks  {
    @Test(priority = 1)
    public static void ValidCredentialsLogin() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage.putUsernameInTheField("Mimi");
        Thread.sleep(2000);
        LoginPage.putPasswordInTheField("Mimi9010");
        Thread.sleep(2000);
        LoginPage.pressLoginButton();



    }

/**
 Test Scenario: Validate unsuccessful user login with incorrect credentials

 * 1. Navigate to the login page
 * 2. Enter incorrect username and password
 * 3. Submit the login form
 * Expected Outcome:
 * - An error message should be displayed indicating login failure.
 */

}
