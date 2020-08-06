package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railway {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement from =driver.findElement(By.id("origin"));
		
		from.sendKeys("chennai");
		
		WebElement to= driver.findElement(By.id("destination"));
		
		to.sendKeys("goa");
		
		driver.close();
	}
}
