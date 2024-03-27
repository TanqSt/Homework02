package FinalProject.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
    public static WebDriver driver;
    @Before
    public static WebDriver getBrowser(String browserName) {

        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\FinalProject\\Resource\\Drivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\FinalProject\\Resource\\Drivers\\geckodriver.exe");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            driver = new FirefoxDriver(firefoxOptions);

        } else if (browserName.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\FinalProject\\Resource\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        //https://www.saucedemo.com
        return driver;
    }
    @After
    public static void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}




