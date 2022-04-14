package TEST_Task;
import Data.ExcelDataProvider;
import Data.Excel_Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Task {
    private WebDriver driver ;
    @BeforeMethod
    public void setUp ()
    {
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test (dataProviderClass = ExcelDataProvider.class ,dataProvider="TEST1_Sheet1")
    public void LoginTest(String usename,String password)
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
