package Base;

import Pages.Home;
import Pages.SecureAreaPage;
import Pages.loginpage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {
     public WebDriver driver;
     protected Home home;

     @BeforeTest
     public void Setup()
     {
         driver = new ChromeDriver();
         driver.get("https://the-internet.herokuapp.com/");
         home = new Home(driver);
     }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
