package org.extendfailedreport;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {

	@Test
	public void simpleReport1() throws IOException {

		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("NewCompleteReport.html");
		final File CONF = new File("Extentconfig.xml");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Tester1");
		spark.config().setDocumentTitle("RegressionTesting");
		// spark.loadXMLConfig(CONF);

		ExtentSparkReporter spark1 = new ExtentSparkReporter("NewFailedReport.html").filter().statusFilter()
				.as(new Status[] { Status.FAIL, Status.SKIP}).apply();
		final File CONF1 = new File("Extentconfig.xml");
		spark1.config().setTheme(Theme.DARK);
		spark1.config().setDocumentTitle("RegressionTestingFailedReport");
		spark1.config().setReportName("Tester2");
		// spark1.loadXMLConfig(CONF1);

		report.attachReporter(spark, spark1);

		// TestCase1
		ExtentTest test1 = report.createTest("Login", "Facebook Login");
		test1.info("Entering username");
		test1.info("Entering password");
		test1.info("Clicking login button");
		test1.pass("Login successful");
		// report.flush();

		// TestCase2
		ExtentTest test2 = report.createTest("Home", "Facebook Registeration");
		test2.info("Entering FirstName");
		test2.info("Entering LastName");
		test2.info("Clicking submit");
		test2.pass("Registration successful");
		// report.flush();

		// TestCase3
		ExtentTest test3 = report.createTest("Delete", "Facebook DeleteAccount");
		test3.info("Entering FirstName");
		test3.info("Entering LastName");
		test3.info("Clicking submit");
		test3.fail("Delete unsuccessful");
		// report.flush();

		// TestCase4
		ExtentTest test4 = report.createTest("Logout", "Facebook Logout");
		test4.info("Click MyAccount");
		test4.info("Scroll to Logout");
		test4.info("Clicking Logout");
		test4.skip("Logout unsuccessful");
		report.flush();
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