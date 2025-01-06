package org.dataprovider_parameter;

import org.testng.annotations.Test;

public class DataproviderIntergrationEx {

	@Test(dataProvider="TestType", dataProviderClass=org.dataprovider_parameter.DataproviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration testing: Data(" + data +")");

	}
}
