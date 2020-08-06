package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagrram {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");

		WebElement instaUs=driver.findElement(By.name("username"));
		
		instaUs.sendKeys("sanjay46");
		
		WebElement password=driver.findElement(By.name("password"));
		
		password.sendKeys("sadaaddfafafasfa");
	
		driver.close();
	}


}
