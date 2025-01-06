package org.itestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener{

	
	  public void onTestStart(ITestResult result) {
	    
		  System.out.println("The Test started: "+result.getName());
	  }

	
	  public void onTestSuccess(ITestResult result) {
	  System.out.println("The TestSuccess: "+result.getName());
	  }

	  public void onTestFailure(ITestResult result) {
	   System.out.println("The Test Failure: "+result.getName());
	  }

	
	  public void onTestSkipped(ITestResult result) {
	    System.out.println("The Test skipped: "+result.getName());
	  }

	
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	   System.out.println("The Test failued but with in the success percentage: "+result.getName());
	  }

	
	  public void onTestFailedWithTimeout(ITestResult result) {
	  System.out.println("The Test Failure with Timeout: "+result.getName());
	  }

	  public void onStart(ITestContext context) {
	    System.out.println("The Test onStart: "+context.getName());
	  }

	
	  public void onFinish(ITestContext context) {
	   System.out.println("The Test onFinish: "+context.getName());
	  }
	}

	


