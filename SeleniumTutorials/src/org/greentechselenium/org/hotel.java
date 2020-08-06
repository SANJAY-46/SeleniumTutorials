package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.adactin.com/HotelApp/");
	
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys("sanjay");
		
		WebElement pass=driver.findElement(By.id("password"));
		
		pass.sendKeys("sdvsdfdsfsdfsdfs");
		
		driver.close();
		
	}

}
