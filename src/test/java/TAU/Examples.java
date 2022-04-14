package TAU;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
@TestInstance(PER_CLASS)
public class Examples {

    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeAll
    public void beforeAll() {
        driver = new ChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }
    @Test
    public void verifyLogo()
    {
        driver.get("https://duckduckgo.com/");
        WebElement DuckLogo = driver.findElement(By.id("logo_homepage_link"));
        Assert.assertEquals(true, DuckLogo.isDisplayed());

    }
    @Test
    public void verifyCheckbox2()
    {
        driver.get("https://the-internet.herokuapp.com/");
       // wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(
          //     By.cssSelector("div.example>form :nth-child(3)")));

        WebElement link = driver.findElement(By.linkText("Checkboxes"));
        link.click();

        WebElement check2 = driver.findElement(By.cssSelector
                ("div.example>form :nth-child(3)"));
        Assert.assertTrue(check2.isSelected());


    }
    @Test
    public void verifyInput()
    {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link = driver.findElement(By.linkText("Inputs"));
        link.click();

        WebElement input = driver.findElement(By.xpath
                ("//input"));
       // Assert.assertTrue(input.isEnabled());

        input.sendKeys("2");
        String n =input.getAttribute("type");
        Assert.assertEquals("number",n,"The input field Fails the test");


        input.sendKeys("2");
        Assert.assertNotNull(input.getAttribute("value"),
                "The input field Fails the test");

        Assert.assertEquals("2",input.getAttribute("value"),"The input field Fails the test");


    }



}
