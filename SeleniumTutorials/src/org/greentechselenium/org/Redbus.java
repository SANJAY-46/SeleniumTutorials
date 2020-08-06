package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.redbus.in");
		
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("chennai");
	  
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("goa");
	
		driver.close();
	}
	

}
