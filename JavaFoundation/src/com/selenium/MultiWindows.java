package com.selenium.windows;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.commons.utils.BrowserFactory;

public class MultiWindows {
	WebDriver chromeInstance;
	File screenPrint;
	
	@BeforeMethod
	public void setUp() throws IOException{
		chromeInstance = BrowserFactory.getDriverInstance();
	}
	
	@Test
	public void findWindows() throws InterruptedException, IOException{
		SoftAssert verify = new SoftAssert();
		WebElement currentElement;
		WebDriverWait waitObj = new WebDriverWait(chromeInstance, 10); 
		Set<String> windowHandles = new HashSet<>();
		String thatWindowsHandle;
		
		//Parent window --> Terminal Entry
		chromeInstance.get("https://www.bluefoxtech.com/skillsmith/QA/selenium/windows.html");
		currentElement = chromeInstance.findElement(By.id("link2FirstWindow"));
		currentElement = waitObj.until(ExpectedConditions.elementToBeClickable(currentElement));
		if(currentElement != null){
			currentElement.click();		//to Airlines Counter
		}		
		Thread.sleep(2000);

		//First Child Window --> Airlines Counter
		chromeInstance.switchTo().window("Freefall Airlines");
		thatWindowsHandle = chromeInstance.getWindowHandle();
		currentElement = chromeInstance.findElement(By.id("link2SecondWindow"));		
		currentElement = waitObj.until(ExpectedConditions.elementToBeClickable(currentElement));
		if(currentElement != null){
			currentElement.click();		//to security check	
		}	
		Thread.sleep(2000);	
		screenPrint = ((TakesScreenshot) chromeInstance).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenPrint, new File("D:\\basura\\screenshots\\airlinescounter.jpg"));
		//Second Child Window --/. Security Check
		chromeInstance.switchTo().window("Snakeline Security");
		
		currentElement = chromeInstance.findElement(By.id("link2ThirdWindow"));	
		currentElement = waitObj.until(ExpectedConditions.elementToBeClickable(currentElement));
		if(currentElement != null){
			currentElement.click();		//to Gate	
		}		
		Thread.sleep(2000);		
		
		//Second Child Window --/. Security Check
		chromeInstance.switchTo().window("Mostly-Closed Gate");
		currentElement = chromeInstance.findElement(By.tagName("h4"));	
		
		if(currentElement != null){
			verify.assertTrue(currentElement.getText().toLowerCase().contains("at the gate"));
		}
		
		//verify if all the windows are intact
		windowHandles = chromeInstance.getWindowHandles();
		Iterator windowHandleIterator = windowHandles.iterator();
		while(windowHandleIterator.hasNext()){
			System.out.println(windowHandleIterator.next().toString());
		}
		chromeInstance.switchTo().window(thatWindowsHandle);				//using a saved window handle
		String airlinesWindowTitle = chromeInstance.getTitle();
		verify.assertEquals(airlinesWindowTitle, "Child Window #1");
		verify.assertFalse(windowHandles.isEmpty(), "Expected windows are not available");
		verify.assertAll();
		Thread.sleep(2000);	
	}

	@AfterMethod
	public void tearDown(){
		chromeInstance.quit();
	}

}
