package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		//2.greentecch google .co.in
		
		driver.get("http://www.google.com");
		
		WebElement g=driver.findElement(By.name("q"));
		
		g.sendKeys("greens technology");
		 
		 
	}
}
