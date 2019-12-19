package com.selenium.appsync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		//String URL = "https://www.bluefoxtech.com/skillsmith/QA/selenium/handlealert.html";
		String URL = "https://www.amazon.com";
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Selenium\\chromedriver478.exe");
		WebDriver chromeInstance = new ChromeDriver();
		chromeInstance.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		chromeInstance.manage().timeouts().pageLoadTimeout(20, TimeUnit.NANOSECONDS);
		chromeInstance.get(URL);
		chromeInstance.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		chromeInstance.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		chromeInstance.findElement(By.partialLinkText("Microsoft Surface"));
	}

}
