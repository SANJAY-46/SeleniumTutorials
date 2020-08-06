package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.swiggy.com");
		
		WebElement location= driver.findElement(By.id("location"));
		
		location.sendKeys("anna nagar chennai-99");
		
		
		
		
	}
}
