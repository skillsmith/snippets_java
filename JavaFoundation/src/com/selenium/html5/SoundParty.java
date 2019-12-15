package com.selenium.html5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class SoundParty {
	WebDriver chromeInstance;
	
	@Test
	public void micTesting123() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		chromeInstance = new ChromeDriver();
		chromeInstance.get("https://www.bluefoxtech.com/skillsmith/QA/selenium/html5elements.html");
		
		WebElement currentElement;
		JavascriptExecutor jsExecutor = (JavascriptExecutor) chromeInstance;
		WebDriverWait waitObj = new WebDriverWait(chromeInstance, 10); 
		
		//Step 1: Catch {find}
		currentElement = chromeInstance.findElement(By.id("audioID"));
		//currentElement = (WebElement) jsExecutor.executeScript("return document.getElementById(arguments[0])", "audioID");
		currentElement = waitObj.until(ExpectedConditions.elementToBeClickable(currentElement));
		Thread.sleep(2000);
		jsExecutor.executeScript("arguments[0].focus()", currentElement);
		currentElement.sendKeys(Keys.ENTER);
		//jsExecutor.executeScript("arguments[0].play()", currentElement);
		
		Thread.sleep(5000);
		jsExecutor.executeScript("arguments[0].pause()", currentElement);
		double playedForDuration  = (Double) jsExecutor.executeScript("return arguments[0].currentTime", currentElement);
		double totalDuration  = (Double) jsExecutor.executeScript("return arguments[0].duration", currentElement);
		
		System.out.print("Duration:"+totalDuration+" & Played for:"+playedForDuration);
		Assert.assertTrue(playedForDuration > 0L, "Player did not work as expected");

	}

	@AfterMethod
	public void tearDown(){
		chromeInstance.close();
	}

}

