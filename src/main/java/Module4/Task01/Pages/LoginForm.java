package Module4.Task01.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm {

        public static WebDriver driver;


         static By userNameField = By.id("username");
       static By passwordField = By.id("password");
         static By loginButton = By.className("btn-primary");
         static By loginAllert=By.className("alert-warning");

        public LoginForm(WebDriver driver) {
            this.driver = driver;
        }

        public static void insertUsernameInTheField(String username) {
            driver.findElement(userNameField).sendKeys(username);
        }

        public static void insertPasswordInTheField(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public static void pressLoginButton() {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            driver.findElement(loginButton).click();
        }
    public static Boolean visibleAlert(){
        return driver.findElement(loginAllert).isDisplayed();}


        }




