package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/ \r\n");
		
		WebElement customerID=driver.findElement(By.name("fldLoginUserId"));
		
		customerID.sendKeys("13131322");
		
		driver.close();
	}

}
