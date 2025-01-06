package org.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {

	@Test
	@Parameters({"url","user","pass"})
	public void login(String url,String user,String pass) {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.close();

	}
}
