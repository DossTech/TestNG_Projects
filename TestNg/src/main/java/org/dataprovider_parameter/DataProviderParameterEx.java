package org.dataprovider_parameter;

import org.testng.annotations.Test;

public class DataProviderParameterEx {

	
	@Test(dataProvider="scenarioData",dataProviderClass=DataproviderSource.class)
	public void scenario1(String scenarioData) {
	System.out.println("Scenario Testing1: Data ("+ scenarioData + ")");

	}
	
	
	@Test(dataProvider="scenarioData",dataProviderClass=DataproviderSource.class)
	public void scenario2(String scenarioData) {
		System.out.println("Scenario Testing2: Data ("+ scenarioData + ")");

	}
	
	@Test(dataProvider="scenarioData",dataProviderClass=DataproviderSource.class)
	public void commonScenario(String scenarioData) {
		System.out.println("CommonScenario Testing: Data ("+ scenarioData + ")");

	}
}
