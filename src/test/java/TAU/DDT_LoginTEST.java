package TAU;

import TAU.DDT_LoginData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDT_LoginTEST {
    WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void setUp ()
    {
        driver = new ChromeDriver ();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test (dataProviderClass = DDT_LoginData.class, dataProvider = "signin-provider")
    public void signIn (String usename, String password,boolean expected_R)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(usename);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
        String expectedUrl =
                "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }
    @AfterMethod
    public void Quit ()
    {
        driver.quit();
    }
}
