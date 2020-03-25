package com.selenium.browser;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChocoCookies {
	WebDriver chromeInstance;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		chromeInstance = new ChromeDriver();
		chromeInstance.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}

	@Test
	public void catchAndKickThem() throws InterruptedException {
		Set<Cookie> cookiesOfWebSite = chromeInstance.manage().getCookies();

		for (Cookie cookieInHand : cookiesOfWebSite) {
			System.out.println(cookieInHand.getName());
		}

		Thread.sleep(30 * 1000);
		Cookie cookieTheyBaked = chromeInstance.manage().getCookieNamed("skin");
		Cookie cookieIBaked = cookieTheyBaked;
		chromeInstance.manage().deleteCookie(cookieTheyBaked);
		Thread.sleep(1500);
		Assert.assertNull(chromeInstance.manage().getCookieNamed("skin"), "Cookie is not deleted, it exists");

		chromeInstance.manage().addCookie(cookieIBaked);
		Thread.sleep(1500);
		Assert.assertNotNull(chromeInstance.manage().getCookieNamed("skin"), "Cookie must be there but NOT");

		chromeInstance.manage().deleteAllCookies();
		chromeInstance.manage().addCookie(cookieIBaked);
		for (Cookie cookieInHand : cookiesOfWebSite) {
			System.out.println("Checking if " + cookieInHand.getName() + " exists...");
			Assert.assertNull(chromeInstance.manage().getCookieNamed(cookieInHand.getName()),
					"Cookie is not deleted, it exists");
		}
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		chromeInstance.close();
	}

}
