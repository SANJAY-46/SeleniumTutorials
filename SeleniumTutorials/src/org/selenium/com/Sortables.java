package org.selenium.com;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		
		List<WebElement> sortable=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		WebElement fromElement = sortable.get(6);
		WebElement toElement =sortable.get(0);
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform();
		
	}

}
