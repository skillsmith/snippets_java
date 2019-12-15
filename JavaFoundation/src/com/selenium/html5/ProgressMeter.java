package com.selenium.html5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProgressMeter {
	WebDriver chromeInstance;
	
	@Test
	public void micTesting123() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		chromeInstance = new ChromeDriver();
		chromeInstance.get("https://www.bluefoxtech.com/skillsmith/QA/selenium/html5elements.html");
		
		WebElement currentElement;
		JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeInstance;
		WebDriverWait waitObj = new WebDriverWait(chromeInstance, 10); 
		
		currentElement = chromeInstance.findElement(By.id("progressMeter"));
		Thread.sleep(2000);
		long downloadProgressAt_t1  = (Long) jsExecutor.executeScript("return arguments[0].value", currentElement);
		jsExecutor.executeScript("return arguments[0].value=80", currentElement);
		Thread.sleep(5000);
		long downloadProgressAt_t2  = (Long) jsExecutor.executeScript("return arguments[0].value", currentElement);

		System.out.print("Total download progress:"+ (downloadProgressAt_t2-downloadProgressAt_t1));
		Assert.assertTrue((downloadProgressAt_t2-downloadProgressAt_t1)>0);

	}

	@AfterMethod
	public void tearDown(){
		chromeInstance.close();
	}

}

