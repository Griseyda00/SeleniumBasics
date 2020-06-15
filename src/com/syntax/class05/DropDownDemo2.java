package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{
public static void main(String[] args) {
	setUp();//In properties file, uncomment demoqa.com URL (code written for demoqa.com).
	WebElement continents=driver.findElement(By.xpath("//select[@id='continents']"));
	Select select=new Select(continents);
	List<WebElement> options=select.getOptions();
	for(WebElement option:options) {
		
		String text=option.getText();
		System.err.println(text);
		
		if(text.equals("Africa")) {
			option.click();
			
			String ddText=option.getText();
			
			if(ddText.equals("Africa")) {
				System.out.println("Africa is selected:: "+option.isSelected());
			}else {
				System.out.println("Africa is Not selected");
			}
		}
	}
	
	boolean isMultiple=select.isMultiple();
	System.out.println("The continent DD is multiple "+isMultiple);
	tearDown();
	
}
}
