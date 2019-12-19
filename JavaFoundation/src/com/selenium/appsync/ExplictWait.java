package com.selenium.appsync;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExplictWait {
	WebDriver chromeInstance;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		chromeInstance = new ChromeDriver();
		chromeInstance.get("https://www.bluefoxtech.com/skillsmith/QA/selenium/handlealert.html");
	}
	
	@Test
	public void catchAndKickThem() throws InterruptedException{
		WebElement currentElement;
		WebDriverWait waitObj = new WebDriverWait(chromeInstance, 10); 
		
		//Step 1: Catch {find}
		currentElement = waitObj.until(ExpectedConditions.presenceOfElementLocated(By.id("button100")));
		//currentElement = chromeInstance.findElement(By.id("button100"));		

		//Step 2: Kick {act}
		currentElement = waitObj.until(ExpectedConditions.elementToBeClickable(currentElement));
		if (currentElement != null){
			currentElement.click();			
		}

	}

	@AfterMethod
	public void tearDown(){
		chromeInstance.close();
	}

}
