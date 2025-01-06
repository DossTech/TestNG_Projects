package org.dataprovider_parameter;

import org.testng.annotations.Test;

public class DataproviderUnitEx {
	@Test(dataProvider="TestType", dataProviderClass=org.dataprovider_parameter.DataproviderSource.class)
	public void unitTest(String data) {
		System.out.println("Unit testing: Data(" + data +")");

	}
}
