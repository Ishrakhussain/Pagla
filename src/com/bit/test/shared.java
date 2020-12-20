package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class shared {
ChromeDriver dr;

public void openBrowser() {
System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\Ishra\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");

dr = new ChromeDriver();}


public void closeBrowser() {
	dr.quit();}


public void gotoAnyWebsite(String url) {
	dr.get(url);}


public void verifyElementDisplayed(By locator) {
	// to validate if an element is displayed in a page or not
	boolean u = dr.findElement(locator).isDisplayed();
	System.out.println("Is Element displayed? :" + u);
}

public void clickonAnyElement(By locator) {
	dr.findElement(locator).click();}


public void typeonAnyElement(By locator, String value) {
	dr.findElement(locator).sendKeys(value);
}

public void printtitle() {
	String x = dr.getTitle();
	System.out.println(x);
}

public void printurl() {
	String x = dr.getCurrentUrl();
}
}