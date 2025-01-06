package org.testcases.parallel1;

import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting TestA");
		Thread.sleep(1500);
		System.out.println("Ending TestA");
	}
}
