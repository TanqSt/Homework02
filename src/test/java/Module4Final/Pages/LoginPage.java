package Module4Final.Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginPage {
    public static WebDriver driver;


    static By userNameField = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    static By passwordField = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    static By loginButton = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void putUsernameInTheField(String username) {
        driver.findElement(userNameField).sendKeys(username);
        Assert.assertTrue(driver.findElement(userNameField).isDisplayed());
    }

    public static void putPasswordInTheField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public static void pressLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(loginButton).click();
    }
}
