package Homework10.Test;

import java.util.List;

import org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.lang.NullPointerException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Homework10.Helpers.BrowserFactory;
import Homework10.PageObjectModels.FirstPage;

public class FirstTest {
    WebDriver driver;

    @Test
    public void verifyAll() throws InterruptedException {
        WebDriver driver = BrowserFactory.getBrowser("Chrome");
        FirstPage page = new FirstPage(driver);

        String ExpectedLogo = "Swag Labs";
        page.displayLogo();
        Assert.assertEquals("Swag Labs", "Swag Labs");


        page.enterUserName("standard_user");
        Assert.assertNotNull("standard_user");

        page.enterPass("secret_sauce");
        Assert.assertTrue(true);

        page.clickLogButton();
        Assert.assertSame("login-button", "login-button");

        BrowserFactory.tearDown();
    }
}



