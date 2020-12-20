package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class scenario {
	public static void targetTest() throws InterruptedException {
		shared S = new shared ();
		S.openBrowser();
		S.gotoAnyWebsite("https://www.target.com/");
		S.typeonAnyElement(By.xpath("//input[@id='search']"), "girls kid shoes");
		S.clickonAnyElement(By.xpath("//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']"));
		Thread.sleep(5000);
		S.clickonAnyElement(By.xpath("//*[@id=\"search\"]"));
		//Thread.sleep(5000);
		
	   // S.clickonAnyElement(By.xpath("//*[@id=\"viewport\"]/div[5]/div/div[2]/div[2]/div[3]/div[2]/div[4]"));
		
	  		//S.clickonAnyElement(By.xpath(""));
	}
}
