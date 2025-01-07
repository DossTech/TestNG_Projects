package org.extendreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class SampleReport {

	@Test
	public void simpleReport() {
		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("New spark report.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Reporting1");
		spark.config().setReportName("Tester1");
		report.attachReporter(spark);
		
		ExtentTest test1 = report.createTest("Login", "Facebook Login");
		test1.info("Entering username");
		test1.info("Entering password");
		test1.info("Clicking login button");
		test1.pass("Login successful");
		report.flush();
	}
}
