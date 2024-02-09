package Homework10.PageObjectModels;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FirstPage {
    WebDriver driver;
    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }
    By logo = By.className("login_logo");
    public void displayLogo(){
        driver.findElement(logo).isDisplayed();
    }
    By userName=By.id("user-name");
   public void enterUserName(String user){
       driver.findElement(userName).sendKeys(user);
   }
   By password=By.id("password");
   public void enterPass(String pass){
      driver.findElement(password).sendKeys(pass);
   }
   By loggButton=By.id("login-button");
   public void clickLogButton(){
       driver.findElement(loggButton).click();
   }
}
