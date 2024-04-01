package FinalProject.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    public WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By basket = By.id("shopping_cart_container");
    By checkoutButton = By.name("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.name("finish");
    //By confirmation =By.xpath("//*[contains(text(),'Thank you for your order!']");
    By confirmation = By.xpath("//h2[contains(text(),'Thank you for your order!')]");


    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
    }

    public void clickCart() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(basket)));
        Assert.assertTrue(driver.findElement(basket).isEnabled());
        driver.findElement(basket).click();
    }


    public void clickCheckout() {
        WebElement checkoutBttn = driver.findElement(checkoutButton);
        Assert.assertTrue("Checkout button is not displayed", checkoutBttn.isDisplayed());
        driver.findElement(checkoutButton).click();
    }

    public void enterFirstName(String First) {
        driver.findElement(firstName).sendKeys(First);
    }

    public void enterLastName(String Last) {
        WebElement lastName1 = driver.findElement(lastName);
        Assert.assertTrue("Last name is not displayed", lastName1.isDisplayed());
        driver.findElement(lastName).sendKeys(Last);
    }

    public void enterPostalCode(String Code) {
        WebElement postalCode = driver.findElement(postCode);
        Assert.assertTrue("Postal code is not displayed", postalCode.isDisplayed());
        driver.findElement(postCode).sendKeys(Code);

    }

    public void clickContinueButton() {
        Assert.assertTrue(driver.findElement(continueButton).isEnabled());
        driver.findElement(continueButton).click();

    }

    public void clickFinishButton() {
        Assert.assertTrue(driver.findElement(finishButton).isEnabled());
        driver.findElement(finishButton).click();
    }

    public String seeConfirmMessage() {
        WebElement confirmationElement = driver.findElement(confirmation);
        Assert.assertNotNull("Confirmation element is null", confirmationElement);
        boolean isDisplayed = confirmationElement.isDisplayed();
        Assert.assertTrue("Confirmation message is not displayed", isDisplayed);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return confirmationElement.getText();
    }
}







