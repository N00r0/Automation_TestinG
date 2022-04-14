package TEST_Task;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;



public class Test_With_Report {
    WebDriver driver;
    ExtentHtmlReporter reporter;
    ExtentReports ex_report;
    @BeforeTest
    public void setUp ()
    {

        reporter = new ExtentHtmlReporter("Test_Report.html");
        ex_report = new ExtentReports();
        ex_report.attachReporter(reporter);
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");

    }
    @Test
    public void Test () throws IOException {
        ExtentTest test = ex_report.createTest("MYFirst test", " simple description");
        test.log(Status.INFO,"this step is show usage of log(Status ,details) ");
       // test.info("this step is show usage of info(details)");
        test.fail("details",
                MediaEntityBuilder.createScreenCaptureFromPath("screnshote.png").build());
        test.addScreenCaptureFromPath("screnshote.png");

    }
    @Test
    public void Test1 () throws IOException {
        ExtentTest test = ex_report.createTest("MYFirst test", " simple description");
        test.log(Status.INFO,"this step is show usage of log(Status ,details) ");
        test.info("this step is show usage of info(details)");
        test.pass("details",
                MediaEntityBuilder.createScreenCaptureFromPath("screnshote.png").build());
        test.addScreenCaptureFromPath("screnshote.png");
    }

    @AfterTest
    public void Quit ()
    {
        ex_report.flush();

    }

}
