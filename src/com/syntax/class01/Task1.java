package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.linkText("Register here")).click();
	driver.findElement(By.name("firstName")).sendKeys("John");
	driver.findElement(By.name("lastName")).sendKeys("Smith");
	driver.findElement(By.name("phone")).sendKeys("123-456-7890");
	driver.findElement(By.id("userName")).sendKeys("johnsmith2019@gmail.com");
	driver.findElement(By.name("register")).click();		
}
}
