package FinalProject.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        Assert.assertTrue(driver.findElement(checkoutButton).isDisplayed());
        driver.findElement(checkoutButton).click();
    }

    public void enterFirstName(String First) {
        driver.findElement(firstName).sendKeys(First);
    }

    public void enterLastName(String Last) {
        Assert.assertTrue(driver.findElement(lastName).isDisplayed());
        driver.findElement(lastName).sendKeys(Last);
    }

    public void enterPostalCode(String Code) {
        Assert.assertTrue(driver.findElement(postCode).isDisplayed());
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

    public String seeConfirmMessage(String confirm) {
        driver.findElement(confirmation).isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(confirmation, "Thank you for your order!"));
        Assert.assertNotNull(confirmation);
        return confirm;
    }

}



