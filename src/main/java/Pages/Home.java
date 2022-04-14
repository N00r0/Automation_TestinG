package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    private By clickOnFormV = By.linkText("Form Authentication");
    private WebDriver driver ;
    public Home (WebDriver driver)
    {
        this.driver = driver;
    }
    public loginpage ClickOnFormLink ()
    {
        driver.findElement(clickOnFormV).click();
        return new loginpage(driver);
    }

}
