package Module4Final.Tests;
import Module4Final.Pages.AccountCreate;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static Module4Final.Resource.Hooks.driver;
import java.lang.NullPointerException;

//Test Scenario: Validate successful user registration

        //1. Navigate to the registration page
         //2. Fill in the registration form with valid user information
         //3. Submit the form
         //Expected Result:
         // A success message should be displayed indicating that the user account was created successfully.
@Test(priority = 1)
public class TestAccountCreate extends Module4Final.Resource.Hooks {


    public void accountCreation()  {
        AccountCreate.addFirstName("Maria");
        AccountCreate.addLastName("Ivanova");
        AccountCreate.addAddress("bul.Ivan Vazov");
        AccountCreate.addCity("Varna");
        AccountCreate.addState("Varna");
        AccountCreate.addZipCode("9010");
        AccountCreate.addPhone("0888888888");
        AccountCreate.addSsn("9010");
        AccountCreate.addUserName("Mimi");
        AccountCreate.addPassword("Mimi9010");
        AccountCreate.repeatPassword("Mimi9010");
        AccountCreate.pressLoginButton();
        AccountCreate.seeConfirmMessage();




    }

}



