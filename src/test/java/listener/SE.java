package listener;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
@TestInstance(PER_CLASS)

public class SE {
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
          driver = new ChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void open_ShiftingContent_And_VerifyTHECount_Of_TheMenuElement() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        link.click();
        link = driver.findElement(By.cssSelector("div.example a[href=\"/shifting_content/menu\"]"));
        link.click();
        List<WebElement> links = driver.findElements(By.cssSelector("ul li "));
        //System.out.println((links.size()));
        Assert.assertEquals(5, links.size());

    }


    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());

    }

}
