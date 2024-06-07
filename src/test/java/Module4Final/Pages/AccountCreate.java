package Module4Final.Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AccountCreate {

    public static WebDriver driver;


   static By verMessTitle = By.xpath("//*[@id=\"rightPanel\"]/h1");
    static By firstNameLocator = By.xpath("//*[@id=\"customer.firstName\"]");
   static By lastNameLocator = By.xpath("//*[@id=\"customer.lastName\"]");
   static By addressLocator = By.id("customer.address.street");
    static By cityLocator = By.xpath("//*[@id=\"customer.address.city\"]");
   static By stateLocator = By.xpath("//*[@id=\"customer.address.state\"]");
   static By zipCode = By.xpath("//*[@id=\"customer.address.zipCode\"]");
   static By phone=By.id("customer.phoneNumber");
    static By ssnLocator = By.id("customer.ssn");
    static By userName = By.id("customer.username");
    static By password = By.id("customer.password");
    static By repeatPass = By.id("repeatedPassword");
    static By submitBtn = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");
    static By loginMessage=By.xpath("/html/body/div[1]/div[3]/div[2]/h1");
    public AccountCreate(WebDriver driver) {
        this.driver = driver;
    }


    // METODS



    public static void addFirstName(String firstName) {driver.findElement(firstNameLocator).sendKeys(firstName);
    }

    public static void addLastName(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public static void addAddress(String address) {
        driver.findElement(addressLocator).sendKeys(address);
    }

    public static void addCity(String city) {
        driver.findElement(cityLocator).sendKeys(city);
    }

    public static void addState(String state) {
        driver.findElement(stateLocator).sendKeys(state);
    }

    public static void addZipCode(String code) {
        driver.findElement(zipCode).sendKeys(code);
    }

    public static void addPhone(String mobPhone) {
        driver.findElement(phone).sendKeys(mobPhone);
    }
    public static void addSsn(String ssn) {
        driver.findElement(ssnLocator).sendKeys(ssn);
    }

    public static void addUserName(String user) {
        driver.findElement(userName).sendKeys(user);
    }

    public static void addPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public static void repeatPassword(String repPass) {
        driver.findElement(repeatPass).sendKeys(repPass);
    }

    public static void pressLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(submitBtn).click();
    }
    //public static Boolean visibleMessage(){
       // return driver.findElement(loginMessage).isDisplayed();

    //}
    public static String seeConfirmMessage() {
        WebElement confirmationElement = driver.findElement(loginMessage);
        Assert.assertNotNull("Confirmation element is null", confirmationElement);
        boolean isDisplayed = confirmationElement.isDisplayed();
        Assert.assertTrue("Confirmation message is not displayed", isDisplayed);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        System.out.print(confirmationElement);
        return confirmationElement.getText();

    }
}


