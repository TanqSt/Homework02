package Module4Final.Tests;
import Module4Final.Pages.AccountCreate;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import java.io.FileReader;
import Module4Final.Resource.ReadConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import static Module4Final.Resource.Hooks.driver;
import java.lang.NullPointerException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject.*;

//Test Scenario: Validate successful user registration

        //1. Navigate to the registration page
         //2. Fill in the registration form with valid user information
         //3. Submit the form
         //Expected Result:
         // A success message should be displayed indicating that the user account was created successfully.
@Test(priority = 1)
public class TestAccountCreate extends Module4Final.Resource.Hooks {


    public void accountCreation()  {

        AccountCreate.addFirstName("firstName");
        AccountCreate.addLastName("lastName");
        AccountCreate.addAddress("address");
        AccountCreate.addCity("city");
        AccountCreate.addState("state");
        AccountCreate.addZipCode("code");
        AccountCreate.addPhone("mobPhone");
        AccountCreate.addSsn("ssn");
        AccountCreate.addUserName("user");
        AccountCreate.addPassword("pass");
        AccountCreate.repeatPassword("repPass");
        AccountCreate.pressLoginButton();
        AccountCreate.seeConfirmMessage();




    }

}



