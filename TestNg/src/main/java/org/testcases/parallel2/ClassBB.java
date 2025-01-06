package org.testcases.parallel2;

import org.testng.annotations.Test;

public class ClassBB {

	@Test
	public void testBB() throws InterruptedException {
		System.out.println("Starting TestBB");
		Thread.sleep(1500);
		System.out.println("Ending TestBB");
	}
}
