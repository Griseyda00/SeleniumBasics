package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass{
public static void main(String[] args) {
	setUp();
	WebDriver driver=setUp();
	driver.findElement(By.xpath("//button[@id='alert]")).click();
	
}
}
