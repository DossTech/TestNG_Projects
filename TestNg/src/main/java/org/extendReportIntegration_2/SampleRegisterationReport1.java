package org.extendReportIntegration_2;

import java.io.File;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleRegisterationReport1 {

	public static ExtentReports reports;
	public static ExtentTest test1;
	public static ExtentTest test2;
	public static ExtentTest test3;
	public static ExtentTest test4;

	@BeforeMethod
	public void init() {
		reports = ReporterSolver.uniqueReporter();
		test2 = reports.createTest("Home", "Facebook Registeration");
		/*
		reports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Index.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Tester1");
		spark.config().setDocumentTitle("Facebook_Registeration");

		/*
		ExtentSparkReporter spark1 = new ExtentSparkReporter("Index2.html").filter().statusFilter()
				.as(new Status[] { Status.FAIL, Status.SKIP }).apply();
		spark1.config().setTheme(Theme.DARK);
		spark1.config().setDocumentTitle("FailedReport");
		spark1.config().setReportName("Tester2");
		reports.attachReporter(spark, spark1);
		
		
		
				test1 = reports.createTest("Login", "Facebook Login");
		test3 = reports.createTest("Delete", "Facebook DeleteAccount");
		test4 = reports.createTest("Logout", "Facebook Logout");
*/

	
	
	}

	@AfterMethod
	public void end() {
		reports.flush();

	}

	@Test
	public void simpleReport1() throws IOException {
/*
		// TestCase1: Facebook Login
		test1.info("Entering username");
		test1.info("Entering password");
		test1.info("Clicking login button");
		test1.pass("Login successful");
		// report.flush();
		  */
		
		// TestCase2: Facebook Registeration
		test2.info("Entering FirstName");
		test2.info("Entering LastName");
		test2.info("Clicking submit");
		test2.pass("Registration successful");
		// report.flush();

		/*
		// TestCase3
		// ExtentTest test3 = reports.createTest("Delete", "Facebook DeleteAccount");
		test3.info("Entering FirstName");
		test3.info("Entering LastName");
		test3.info("Clicking submit");
		test3.fail("Delete unsuccessful");
		Assert.assertEquals("AccountDeleted", "Facebook account deleted");
		test3.fail("Deletion Failed");
		// report.flush();

/*
		// TestCase4
		// ExtentTest test4 = reports.createTest("Logout", "Facebook Logout");
		test4.info("Click MyAccount");
		test4.info("Scroll to Logout");
		test4.info("Clicking Logout");
		test4.pass("Logout unsuccessful");
		// reports.flush();
		/*
		 * ExtentReports report = new ExtentReports(); ExtentSparkReporter spark = new
		 * ExtentSparkReporter("New spark report1.html"); final File CONF = new
		 * File("Extentconfig.xml"); spark.config().setTheme(Theme.STANDARD);
		 * spark.config().setDocumentTitle("RegressionReporting1");
		 * spark.config().setReportName("Tester1"); spark.loadXMLConfig(CONF);
		 * report.attachReporter(spark);
		 * 
		 * 
		 * 
		 * 
		 * ExtentTest test1 = report.createTest("Login", "Facebook Login");
		 * test1.info("Entering username"); test1.info("Entering password");
		 * test1.info("Clicking login button"); test1.pass("Login successful");
		 * report.flush(); }
		 * 
		 * //json report
		 * 
		 * @Test public void simpleReport2() throws IOException {
		 * 
		 * ExtentReports report = new ExtentReports(); ExtentSparkReporter spark = new
		 * ExtentSparkReporter("New spark report2.html"); final File CONF = new
		 * File("Extentconfig.json"); spark.config().setTheme(Theme.STANDARD);
		 * spark.config().setDocumentTitle("RegressionReporting2");
		 * spark.config().setReportName("Tester2"); spark.loadJSONConfig(CONF);
		 * report.attachReporter(spark);
		 * 
		 * 
		 * ExtentTest test2 = report.createTest("Login", "Facebook Login");
		 * test2.info("Entering username"); test2.info("Entering password");
		 * test2.info("Clicking login button"); test2.pass("Login successful");
		 * report.flush(); }
		 */
	}
}