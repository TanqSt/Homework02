package Module4Final.Tests;
import Module4Final.Pages.TransferFunds;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.NullPointerException;
import Module4Final.Pages.LoginPage;


//Test Scenario: Validate successful fund transfer between accounts

        //* 1. Navigate to the fund transfer page
        //* 2. Enter transfer details and amount
        //* 3. Submit the transfer form
        //* Expected Outcome:
        //* - A success message should be displayed indicating the completion of the fund transfer.
public class TestTransferFunds extends Module4Final.Resource.Hooks {
    @Test
    public void transferFunds() throws InterruptedException
    {

        LoginPage.putUsernameInTheField("Mimi");
        LoginPage.putPasswordInTheField("Mimi9010");
        LoginPage.pressLoginButton();
        TransferFunds.transfer();


    }

}
            //Test Scenario: Validate successful bill payment
     // Steps:
   // 1. Navigate to the bill payment page
    // 2. Enter payee details, account information, and amount
      // 3. Submit the bill payment form
      //Expected Outcome:A success message should be displayed indicating the completion of the bill payment.

            //Test Scenario: Validate accurate retrieval of transactions
        //Steps:
       // 1. Navigate to the transaction search page
       // 2. Enter search criteria and initiate the search
       // Expected Outcome:The system should display transactions matching the specified criteria.