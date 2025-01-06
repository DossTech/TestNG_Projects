package org.grouping;

import org.testng.annotations.Test;

public class TestingGrouping {

	
	@Test(groups= {"UnitTesting"})
	public void testing1() {
	System.out.println("UnitTesting done");
	}
	
	@Test(groups= {"IntegrationTesting"})
	public void testing2() {
	System.out.println("IntegrationTesting done");
	}
	
	@Test(groups={"RegressionTesting"})
	public void testing3() {
	System.out.println("RegressionTesting done");
	}
}
