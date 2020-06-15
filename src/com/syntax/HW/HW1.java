package com.syntax.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	WebElement username=driver.findElement(By.cssSelector("input[name*=name]"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	password.sendKeys("Hum@nhrm123");
	WebElement login=driver.findElement(By.cssSelector("input[value='LOGIN']"));
	Thread.sleep(2000);
	login.click();
	WebElement img=driver.findElement(By.xpath("//img[contains(@src,'symfony')]"));
	Thread.sleep(2000);
	String results=null;
	if(img.isDisplayed()) {
	results="Test case passed ";
	}else {
	results="Test case failed";
	}
	System.out.println(results);
	driver.quit();
	}
}
