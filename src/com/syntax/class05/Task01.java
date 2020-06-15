package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task01 {
	public static String url="https://www.facebook.com/";
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	WebElement mulselect=driver.findElement(By.id("month"));
	Select select=new Select(mulselect);
 select.deselectByVisibleText("Mar");
 
	}
}
