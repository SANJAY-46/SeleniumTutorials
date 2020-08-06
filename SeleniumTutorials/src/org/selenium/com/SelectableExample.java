package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		// id eduka mudiyathu because ithu oru list so xpath edukanum and last la /li nu add pannum to get the list 
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL)
		
		.click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		//control press aytu then click pani selecct panrathu dan so get use pani index vangrom avalodan
		
		
	
		
		
		
		
	}

}
