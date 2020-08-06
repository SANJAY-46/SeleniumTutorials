package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxes {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//enter your email address
		
		WebElement  emailbox = driver.findElement(By.id("email"));
	    emailbox.sendKeys("sanjayhotdude15@gmail.com");
		
		// append a text 
		
		WebElement Appendbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	    Appendbox.sendKeys("sanjay");
		
		//get default text in website stored in console
		
		WebElement getbox =driver.findElement(By.name("username"));
		String value =getbox.getAttribute("value");
		System.out.println(value);
		
		//clear the text
		
		WebElement clearbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		//confirm that the edit field is empty
		
		WebElement  disabledbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean answer = disabledbox.isEnabled();
		
	   System.out.println(answer);
	    
		
	}

}
