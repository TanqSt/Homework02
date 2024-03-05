package FinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.id("user-name");
    By password = By.id("password");
    By loggButton = By.id("login-button");

    public void enterUserName(String user) {
        driver.findElement(userName).sendKeys(user);
    }

    public void enterPass(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogButton() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loggButton));
        driver.findElement(loggButton).click();
    }
}
