package Demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {

		// Create the Spark Report
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the Spark report information
		spark.config().setDocumentTitle("Regression Testing For the SwagLabs");
		spark.config().setReportName("RegresstionSuite");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent report
		ExtentReports report = new ExtentReports();

		// Attach the Spark report and Extent report
		report.attachReporter(spark);

		// Configure the system information in Extent report
		report.setSystemInfo("DeviceName", "Anusha");
		report.setSystemInfo("OperatingSystem:", "Windows 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-138.0.7204.169");

		// Create the Test Information
		ExtentTest test = report.createTest("Regresstion test");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the Browser Successful");

		test.log(Status.INFO, "Step2: Navigating to the application via URL Successful");

		test.log(Status.INFO, "Step3: Verify the web page Successful");

		if (true == true) {
			test.log(Status.PASS, "Step4: Verified the WebElement is Displayed");
		} else {
			test.log(Status.FAIL, "Step4: Verified the WebElement is not Displayed");
		}
		test.log(Status.SKIP, "Step5: Element is Hidden Successfully");

		// Flush the report Information
		report.flush();
		
		System.out.println("Execution Done");

	}

}
