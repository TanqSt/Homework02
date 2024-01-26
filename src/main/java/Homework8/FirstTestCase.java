package Homework8;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;


public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\main\\resources\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        boolean logo=driver.findElementByClassName("login_logo").isDisplayed();
        System.out.println(logo);

        driver.findElementById("user-name").sendKeys("standard_user");
        driver.findElementById("password").sendKeys("secret_sauce");
        driver.findElementById("login-button").click();
        Thread.sleep(2000);
        driver.quit();



    }

}
