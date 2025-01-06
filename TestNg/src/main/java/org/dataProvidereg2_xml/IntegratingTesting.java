package org.dataProvidereg2_xml;

import org.testng.annotations.Test;

public class IntegratingTesting {

	@Test(dataProvider="source",dataProviderClass=DataSource.class)
	public void integrationTesting(String data) {
		System.out.println("IntegrationTesting: "+data);
	}
	
}
