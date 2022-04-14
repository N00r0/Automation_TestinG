package TAU;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class DDT_Really_EX {
    WebDriver driver;
    @BeforeMethod
    public void setUp ()
    {
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
    }
    @Test (dataProvider = "login-provider")
    public void logIn (String email, String password, boolean expected_R)
    {

        driver.findElement(By.id("txtUsername")).sendKeys(email);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

        String expectedUrl =
                "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }


    @DataProvider (name = "login-provider")
    public Object [] [] logInData ()
    {
        Object [] [] data = new Object [3] [3];

        data [0] [0] = "Invalid";		data [0] [1] = "Invalid123";		 data [0] [2] = false;
        data [1] [0] = "Admin";			data [1] [1] = "admin123";		     data [1] [2] = true;
        data [2] [0] = "admin";			data [2] [1] = "admin123";			 data [2] [2] = true;
        return data;
    }

    @AfterMethod
    public void Quit ()
    {
        driver.quit();
    }
}
