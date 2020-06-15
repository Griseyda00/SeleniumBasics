package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD {
public static void main(String[] args) {
	WebDriver driver=BaseClass.setUp();
	WebElement multiSelectDD=driver.findElement(By.cssSelector("select#continentsmultiple"));
	Select select=new Select(multiSelectDD);
	boolean isMultiple=select.isMultiple();
	System.out.println("This DropDown is Multi Select?: "+isMultiple);
	
	if(isMultiple) {
		select.selectByIndex(1);
		select.selectByIndex(3);
		select.deselectByVisibleText("Africa");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select.deselectAll();
	}
	BaseClass.tearDown();
	
}
}