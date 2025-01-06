package org.itestListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTesting {

	@Test
	public void testing1() {
		System.out.println("Testing one done");

	}
	
	@Test(dataProvider="data")
	public void testing2(String result) {
		System.out.println("Testing two status: "+result);
	}
	
	@DataProvider(name="data")
	public Object[][] getData() {
		
		return new Object[][] {{"Pass1"},
			{"Pass2"}};

	}
	
	@Test(dataProvider="data1")
	public void testing3(int a, int b) {
		int sum = a+b;
		Assert.assertEquals(sum, 7);

	}
	@DataProvider(name="data1")
	public Object[][] getData1() {
		return new Object[][] {{5,2},
			{2,5}
			};

	}
	
	@Test
	public void testing4() {
	throw new SkipException("null");

	}
	
}
