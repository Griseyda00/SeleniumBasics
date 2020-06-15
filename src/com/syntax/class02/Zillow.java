package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zillow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
		
	WebDriver driver= new FirefoxDriver();	
	driver.navigate().to("https://www.zillow.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().refresh();
	System.out.println(driver.getCurrentUrl());
	String url= driver.getCurrentUrl();
	if(url.contains("Zillow")) {
		System.out.println("You navigated to the correct url");
	}
	else {System.out.println("Invalid url returned");}
	
	
	
	driver.close();
	driver.quit();
	
		
		
		
		
	}}


