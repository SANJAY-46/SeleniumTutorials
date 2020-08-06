package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://www.leafground.com/pages/drop.html");
	
	WebElement from=driver.findElement(By.id("draggable"));
	
	WebElement to=driver.findElement(By.id("droppable"));
	
	Actions actions=new Actions(driver);
	
	//actions nu object create pananum like sslect
	
	actions.dragAndDrop(from, to).build().perform();
	
	//buid perform is used to perfom dat line 
	
	//click move realse kuda use panalam
	
	driver.quit();
	
	
	
	}

}
