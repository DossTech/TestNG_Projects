package org.extendconfigreport;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class SampleReport {

	@Test
	public void simpleReport1() throws IOException {
		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("New spark report1.html");
		final File CONF = new File("Extentconfig.xml");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("RegressionReporting1");
		spark.config().setReportName("Tester1");
		spark.loadXMLConfig(CONF);
		report.attachReporter(spark);
	
		
		ExtentTest test1 = report.createTest("Login", "Facebook Login");
		test1.info("Entering username");
		test1.info("Entering password");
		test1.info("Clicking login button");
		test1.pass("Login successful");
		report.flush();
	}
	
	//json report
	@Test
	public void simpleReport2() throws IOException {
		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("New spark report2.html");
		final File CONF = new File("Extentconfig.json");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("RegressionReporting2");
		spark.config().setReportName("Tester2");
		spark.loadJSONConfig(CONF);
		report.attachReporter(spark);
			
		
		ExtentTest test2 = report.createTest("Login", "Facebook Login");
		test2.info("Entering username");
		test2.info("Entering password");
		test2.info("Clicking login button");
		test2.pass("Login successful");
		report.flush();
	}
}
