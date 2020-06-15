package com.syntax.class09;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass{
public static void main(String[] args) {
	setUp();
	driver.findElement(By.xpath("//button[@type='button']")).click();
	//div[@class=‘ui-datepicker-group ui-datepicker-group-first’]
	//div[@class=‘ui-datepicker-group ui-datepicker-group-last’]		
}

}
