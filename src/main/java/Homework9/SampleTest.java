package Homework9;
import java.util.List;
import org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;
import java.lang.NullPointerException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class SampleTest {
    private static WebDriver driver;
    @BeforeClass
    public static void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\main\\resources\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
   @Test
    public void verifyLogo ()throws InterruptedException   {
        boolean logo = driver.findElement(By.className("login_logo")).isDisplayed();
        String ExpectedLogo = "Swag Labs";
        Assert.assertNotEquals(ExpectedLogo, logo);

    }
    @Test
    public void verifyUserData()throws InterruptedException   {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Assert.assertNotNull(userName);}
@Test
    public void verifyUserPass()throws InterruptedException{

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Assert.assertEquals("secret_sauce", password.getAttribute("value"));
        }
        @Test
     public void verifyLogButton()throws InterruptedException{
        WebElement logButton = driver.findElement(By.id("login-button"));
        logButton.click();
        Assert.assertSame("login-button", "login-button");
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}


