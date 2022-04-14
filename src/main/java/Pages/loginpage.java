package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    private WebDriver driver ;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
   public  loginpage (WebDriver driver)
   {
       this.driver = driver;
   }
   public void  EnterUsername (String username)
   {
       driver.findElement(usernameField).sendKeys(username);
   }

    public void EnterPass(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
