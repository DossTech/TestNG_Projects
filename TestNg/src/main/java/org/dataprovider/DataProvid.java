package org.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProvid {

	public static 	WebDriver driver;

	@Test(dataProvider="getData")
	public void Login(String user,String pass) {
		WebElement btnLogin = driver.findElement(By.id("email"));
		btnLogin.sendKeys(user);

		WebElement btnPass = driver.findElement(By.id("pass"));
		btnPass.sendKeys(pass);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver  = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}
	
	@AfterMethod
	public void afterMethod() {
	driver.close();

	}

	@DataProvider
	public Object[][] getData() {

		return new Object[][] {
			{"abcd@gmail.com","2345"},
			{"efgh@gmail.com","6789"}
		};
	}}
