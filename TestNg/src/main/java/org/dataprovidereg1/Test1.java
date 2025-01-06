package org.dataprovidereg1;

import org.testng.annotations.Test;

public class Test1 {

	
	@Test(dataProvider="data",dataProviderClass=DataSource.class)
	public void method1(String data) {
		
		System.out.println("Method1: "+data);

	}
	@Test(dataProvider="data",dataProviderClass=DataSource.class)
	public void method2(String data) {
		System.out.println("Method2: "+data);

	}
	@Test(dataProvider="data",dataProviderClass=DataSource.class)
	public void method3(String data) {
		System.out.println("Method3: "+data);

	}
}
