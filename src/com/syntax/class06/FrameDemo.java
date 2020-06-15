package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	setUp();//please uncomment uitestpractice.com url.
    driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
    /*
	 * We can switch to a frame using three different methods
	 * 1. By Index. 
	 * 2. By NameOrID
	 * 3. By WebElement
	 */
  //By index
    driver.switchTo().frame(0);
    WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
    name.sendKeys("Vital");
    driver.switchTo().defaultContent();
    Thread.sleep(2000);
    
  //By NameOrID
    driver.switchTo().frame("iframe_a");
    name.clear();
    name.sendKeys("sarmed");
    driver.switchTo().defaultContent();
    Thread.sleep(2000);
    
  //By WebElement
    WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
    driver.switchTo().frame(firstFrame);
    name.clear();
    name.sendKeys("Asel");
    driver.switchTo().defaultContent();
    Thread.sleep(3000);
    tearDown();
    
    
    
    
	
}
}
