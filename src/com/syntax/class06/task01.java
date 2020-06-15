package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class task01 extends BaseClass{
 public static void main(String[] args) {
	setUp();
	WebElement searchDropdown=  driver.findElement(By.id("searchDropdownBox"));
	Select selectDD=new Select(searchDropdown);
	List<WebElement> ddOptions=selectDD.getOptions();
	for(WebElement option:ddOptions) {
		String optionText=option.getText();
		System.out.println(optionText);
	}
	selectDD.selectByVisibleText("Books");
	WebElement SearchtextBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	SearchtextBox.sendKeys("Harry potter");
	
	
 }
}
