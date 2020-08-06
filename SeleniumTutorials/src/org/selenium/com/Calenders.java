package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		//1. enter the day date year using send keys knwing the date format 
		
		WebElement date=driver.findElement(By.id("datepicker"));
		
		//date.sendKeys("10/1/2020",Keys.ENTER);
		
		date.click();
		
		//2.without using send keys and by xpath
		
		WebElement usingXpath=driver.findElement(By.xpath("//a[@title=\"Next\"]"));
		usingXpath.click();
		
		WebElement date2=driver.findElement(By.xpath("//a[contains (text(),\"10\")]"));
		date2.click();
		
	}

}
