package org.testcases.parallel2;

import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void testB() throws InterruptedException {
		System.out.println("Starting TestB");
		Thread.sleep(1500);
		System.out.println("Ending TestB");
	}
}
