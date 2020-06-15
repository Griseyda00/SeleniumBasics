package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	public static void main(String[] args) {
		String fbUrl="https://facebook.com";
	
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get(fbUrl);
		driver.manage().window().fullscreen();
		String url= driver.getCurrentUrl();
		System.out.println("the current url is "+url);
		String Title= driver.getTitle();
		System.out.println(Title);
		driver.close();
}
}