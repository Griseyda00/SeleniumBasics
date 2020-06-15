package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
	
public static void main(String[] args) throws Exception {
	chrome();
	logingToWebsite();
	Thread.sleep(2000);
	message();
	
}
public static WebDriver driver;
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
public static void chrome() {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    driver= new ChromeDriver();
	driver.get(url);
	
    
	
}
public static void logingToWebsite() {
	WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("Admin");
	WebElement login=driver.findElement(By.cssSelector("input[value='LOGIN']"));

	login.click();
}
public static void message() {
	WebElement msg=driver.findElement(By.xpath("//span[@id='spanMessage']"));
	msg.isDisplayed();
	String text=msg.getText();
	String result;
	if(msg.isDisplayed()) {
		result=text+". is displayed";
	}else {
		result=text+". is displayed";
	}
	System.out.println(result);
}
}
