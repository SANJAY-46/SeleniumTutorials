package org.greentechselenium.org;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Day1Exercise {
	
	
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  //1.Facebook
	  
	  driver.get("https://www.facebook.com/");
		
	  WebElement facebookEmail=driver.findElement(By.id("email"));
	  
	  facebookEmail.sendKeys("sanjay46@facebook.com");
	  
	  WebElement password=driver.findElement(By.id("pass"));
	  
	  password.sendKeys("sanjaykumar");
		
	  WebElement logIn=driver.findElement(By.id("loginbutton"));
	  
	  logIn.click();
	  
	  driver.close();
	  
	  
	  
	 }
	
	}
