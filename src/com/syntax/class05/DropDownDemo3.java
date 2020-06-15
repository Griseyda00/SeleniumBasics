package com.syntax.class05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass{
public static void main(String[] args) {
	ArrayList<String> expectedList=new ArrayList<>();
	expectedList.add("Asia");
	expectedList.add("Europe");
	expectedList.add("Africa");
	expectedList.add("Australia");
	
	setUp();
	
	WebElement continents=driver.findElement(By.cssSelector("select[id='continents']"));
	Select select=new Select(continents);
	select.selectByValue("AUS");
	
	List<WebElement> optionList=select.getOptions();
	
	Iterator<WebElement> it=optionList.iterator();
	while(it.hasNext()) {
		String text=it.next().getText();
		System.err.println(text);
		
	}
	if(expectedList.contains(optionList)) {
		System.out.println("The list mathes");
	}else {
		System.out.println("List did not math");
		
	}
	tearDown();
	
}
}
