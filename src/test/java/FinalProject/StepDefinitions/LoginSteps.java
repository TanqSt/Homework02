package FinalProject.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import FinalProject.Pages.LoginPage;

import java.util.concurrent.TimeUnit;

import FinalProject.Pages.ProductPage;
import FinalProject.Pages.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static FinalProject.Pages.Hooks.driver;

public class LoginSteps {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        WebDriver driver = Hooks.getBrowser("Chrome");
    }

    @When("I input valid credentials and click the Login button")
    public void i_input_valid_credentials_and_click_the_login_button() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("standard_user");
        Assert.assertNotNull("standard_user");
        loginPage.enterPass("secret_sauce");
        Assert.assertTrue(true);
        loginPage.clickLogButton();
        Assert.assertSame("login-button", "login-button");
    }

    @And("I click on the backpack button Add to cart")
    public void i_click_on_the_backpack_button_add_to_cart() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddToCart();
    }

    @And("I proceed to checkout")
    public void i_proceed_to_checkout() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickCart();
        productPage.clickCheckout();
    }

    @And("enter my data in the requested fields")
    public void enter_my_data_in_the_requested_fields() {
        ProductPage productPage = new ProductPage(driver);
        productPage.enterFirstName("Ivan");
        productPage.enterLastName("Ivanov");
        productPage.enterPostalCode("1000");
    }

    @Then("I should be able to finish the purchase")
    public void i_should_be_able_to_finish_the_purchase() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickContinueButton();
        productPage.clickFinishButton();
    }

    @And("I could see a confirmation message")
    public void i_could_see_a_confirmation_message() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        productPage.seeConfirmMessage("Thank you for your order!");
        String expectedMessage = "Thank you for your order!";
        Assert.assertEquals("Thank you for your order!", productPage.seeConfirmMessage("Thank you for your order!"));

        Hooks.tearDown();
    }

}
