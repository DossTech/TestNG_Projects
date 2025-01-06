package org.dataProvidereg2_xml;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataSource {

	@DataProvider(name="source")
	public static Object[][] getTest(ITestContext context){
		String testName = context.getName();
		
		
		if ("IntegrationLevel".equals(testName)) {
		return new Object[][] {{"Integration Level Datas "}};
		}
		else {
			return new Object[][] {{"No Relavant Datas"}};
		}
	
	}
}
