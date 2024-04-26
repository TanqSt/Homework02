package Module4.Task01.Test;
import Module4.Task01.Pages.Home;
import Module4.Task01.Pages.LoginForm;
import Module4.Task01.Pages.Hooks;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static Module4.Task01.Pages.Hooks.driver;
import java.lang.NullPointerException;
public class TestLogin extends Hooks{

    @Test(priority = 1)
    public void ValidCredentialsLogin() throws InterruptedException {
       LoginForm.insertUsernameInTheField("maria");
       LoginForm.insertPasswordInTheField("thoushallnotpass");
       LoginForm.pressLoginButton();
       Assert.assertTrue(Home.LoggedUser1());
       Home.clickOnLogoutButton();

    }

    @Test(priority = 2)
    public void loginWithInvalidPassword() throws InterruptedException{

        LoginForm.insertUsernameInTheField("maria");
        LoginForm.insertPasswordInTheField("pass");
        LoginForm.pressLoginButton();
        Assert.assertTrue(LoginForm.visibleAlert());
    }

}



