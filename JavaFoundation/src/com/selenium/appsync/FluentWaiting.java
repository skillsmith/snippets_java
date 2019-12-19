package com.selenium.appsync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FluentWaiting {
	WebDriver chromeInstance;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		chromeInstance = new ChromeDriver();
		chromeInstance.get("https://www.bluefoxtech.com/skillsmith/QA/selenium/handlealert.html");
	}

	@Test
	public void catchAndKickThem() throws InterruptedException {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(chromeInstance)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement currentElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver chromeInstance) {
				return chromeInstance.findElement(By.id("button100"));
			}
		});
		Thread.sleep(2000);
		currentElement.click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() {
		chromeInstance.close();
	}

}
