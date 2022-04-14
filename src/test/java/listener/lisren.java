package listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class lisren implements ITestListener {
    ExtentHtmlReporter reporter;
    ExtentReports ex_report;
    ExtentTest test;
    @Override
    public void onTestStart(ITestResult iTestResult) {

        test = ex_report.createTest("MYFirst test", iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        try {
            System.out.println();
            test.pass("This Test Method is a success",
                    MediaEntityBuilder.createScreenCaptureFromPath("screnshote.png").build());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            test.addScreenCaptureFromPath("screnshote.png");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        try {
            test.fail("This Test Method is a Fail",
                    MediaEntityBuilder.createScreenCaptureFromPath("screnshote.png").build());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            test.addScreenCaptureFromPath("screnshote.png");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        try {
            test.skip("details",
                    MediaEntityBuilder.createScreenCaptureFromPath("screnshote.png").build());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            test.addScreenCaptureFromPath("screnshote.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        reporter = new ExtentHtmlReporter("TestReport.html");
        ex_report = new ExtentReports();
        ex_report.attachReporter(reporter);

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        ex_report.flush();
    }
}
