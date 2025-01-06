package org.testcases.parallel1;

import org.testng.annotations.Test;

public class ClassAA {

	@Test
	public void testAA() throws InterruptedException {
		System.out.println("Starting TestAA");
		Thread.sleep(1500);
		System.out.println("Ending TestAA");
	}
}
