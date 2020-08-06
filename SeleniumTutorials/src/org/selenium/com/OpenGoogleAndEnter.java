package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleAndEnter {
	
public static void main(String[] args) {
      
		
		//1.open chrome;
        //2.Google home page;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		//setting the property of chrome driver and its path
		//
		
		WebDriver driver =new  ChromeDriver();
		
		//initialising driver to chromedriver
		
		driver.get("http://www.google.com");
		
		//get the website link
		
		driver.findElement(By.name("q")).sendKeys("sanjay46"+Keys.ENTER);
		
		//find the element by name id or number then sendkeys is to input  and keys is to use keyboard keys  

}}
