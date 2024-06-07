package Module4Final.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Properties;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Properties;
import java.time.Duration;
public class TransferFunds {
    //public static Properties prop;
    public static WebDriver driver;
    public static Properties prop;
    static By transferFunds = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a");
    static By amount = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/p/input");
    static By fromAccount = By.xpath("//*[@id=\"fromAccountId\"]");
    static By toAccount = By.xpath("//*[@id=\"toAccountId\"]");


    static By transferButton = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]");

    public TransferFunds(WebDriver driver) {
        this.driver = driver;
    }

    public static void transfer() throws InterruptedException {

            driver.findElement(transferFunds).click();
            driver.findElement(amount).sendKeys("500");
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"fromAccountId\"]")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"toAccountId\"]")));
            Select fromAccountselect = new Select(driver.findElement(fromAccount));
            fromAccountselect.selectByValue("13566");
            Select toAccountselect = new Select(driver.findElement(toAccount));
            toAccountselect.selectByValue("13566");
            driver.findElement(transferButton).click();
            //Thread.sleep(2000);
        }
    }
