package org.dataprovider_parameter;

import org.testng.annotations.Test;

public class DataProviderAcceptanceEx {

	
	@Test(dataProvider="TestType", dataProviderClass=org.dataprovider_parameter.DataproviderSource.class)
	public void acceptanceTest(String data) {
		System.out.println("Acceptance testing: Data(" + data +")");

	}
}
