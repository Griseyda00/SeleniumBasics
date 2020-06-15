package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Syntax123");
	driver.quit();		
	}
}


