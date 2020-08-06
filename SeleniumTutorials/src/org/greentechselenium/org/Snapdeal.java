package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys("sanjay");
		
		driver.close();
	
	}

}
