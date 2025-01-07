package org.extendReportIntegration_2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReporterSolver {
	public static ExtentReports reports;
	
	public static ExtentReports uniqueReporter() {
	if (reports==null) {
		reports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Index.html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Tester1");
		spark.config().setDocumentTitle("Facebook_Login");
		
		//also can be included
		ExtentSparkReporter spark1 = new ExtentSparkReporter("Index2.html").filter().statusFilter()
				.as(new Status[] { Status.FAIL, Status.SKIP }).apply();
		spark1.config().setTheme(Theme.DARK);
		spark1.config().setDocumentTitle("FailedReport");
		spark1.config().setReportName("Tester2");
		reports.attachReporter(spark, spark1);
		
			}
	return reports;
	}
}
