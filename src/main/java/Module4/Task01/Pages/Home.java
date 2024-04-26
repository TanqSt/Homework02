package Module4.Task01.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

public class Home {
    static WebDriver driver;


    static By firstNameField = By.id("firstname");
    static By lastNameField = By.id("lastname");
    static By salesTarget = By.id("salestarget");
    static By salesResultField = By.id("salesresult");
    static By submitButton = By.className("btn-primary");
    static By showPerformanceBtn = By.className("btn-info");
    static By deleteAllSalesEntriesBtn = By.className("btn-secondary");
    static By loggedUsername = By.className("username");
    static By logoutButton = By.id("logout");
    static By activeSalesPeople = By.xpath("/html/body/div/div/div/div/div[2]/div[1]/div[1]/span[2]");

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public static void putFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public static void putLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public static void clickOnSalesDropDown() {
        driver.findElement(salesTarget).click();
    }

    public static void selectDropDownOption(String option) {
        switch (option) {
            case "5000":
                driver.findElement(By.xpath("//*[@id=\"salestarget\"]/option[1]")).click();
                break;
            case "10000":
                driver.findElement(By.xpath("//*[@id=\"salestarget\"]/option[2]")).click();
                break;
        }
    }

    public static void fillSalesResult(String salesResult) {
        driver.findElement(salesResultField).sendKeys(salesResult);
    }

    public static void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public static void clickOnShowPerformanceBtn() {
        driver.findElement(showPerformanceBtn).click();
    }

    public static void clickDelEntries() {
        driver.findElement(deleteAllSalesEntriesBtn).click();
    }

    public static boolean LoggedUser1() {
        return driver.findElement(loggedUsername).isDisplayed();
    }

    public static void clickOnLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public static String getActiveSalesPeople() {
        return driver.findElement(activeSalesPeople).getText();
    }

    public static String getTextFromPerfComment(int salesEntries) {
        switch (salesEntries) {
            case 1:
                return driver.findElement(By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr[2]/td/span")).getText();
            case 2:
                return driver.findElement(By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr[4]/td/span")).getText();
            default:
                return "No entries";
        }
    }


    public static void addNewDataEntries(String firstName, String lastName, String salesTarget, String salesResult) {
        putFirstName(firstName);
        putLastName(lastName);
        clickOnSalesDropDown();
        selectDropDownOption(salesTarget);
        fillSalesResult(salesResult);
        clickSubmitButton();
    }

    public static Boolean TableSalesEntries() {
         driver.findElement(showPerformanceBtn).isDisplayed();
         return true;
        }
    }


