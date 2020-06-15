package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
//	1: Amazon link count: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Get all links
//		Get number of links that has text
//		Print to console only the links that has text
	public static String url="https://www.amazon.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of link in Amazon Home page is: "+allLinks.size());
		int count=0;
		for(WebElement link:allLinks) {
			String text=link.getText();
			if(!text.isEmpty()) {
//				System.out.println(text);
				count++;
			}
		}
		System.out.println("Number of non blank link: "+count);
		Thread.sleep(3000);
		driver.quit();
	
		
		
	}
}
