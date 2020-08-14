package org.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	
	public static void main(String[] args) {
      
		
		//1.open chrome;
        //2.Google home pagesssssss;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
	}
}
