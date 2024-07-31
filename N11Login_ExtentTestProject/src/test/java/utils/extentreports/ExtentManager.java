package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager 
{
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() 
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./test-output/ExtentReport/MyReport.html");
        reporter.config().setReportName("Sample Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Host Name", "MyHost");
        extentReports.setSystemInfo("ProjectName", "N11Login_ExtentTestProject");
        extentReports.setSystemInfo("QA Tester", "Amol Deokar");
        extentReports.setSystemInfo("OS", "Win11");
        extentReports.setSystemInfo("Browser", "Chrome");
        return extentReports;
    }
}
