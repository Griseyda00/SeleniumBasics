package com.syntax.class11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMs {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");

		WebElement click = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		click.click();

		WebElement recruitment = driver.findElement(By.xpath("//a[@id= 'menu_recruitment_viewRecruitmentModule']/b"));
		recruitment.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']"));
		Select select = new Select(element);
		select.selectByVisibleText("Accountant");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
		WebElement firstElement = select.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		driver.quit();
	}
}
