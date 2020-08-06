package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement autocomplete=driver.findElement(By.id("tags"));
		
		autocomplete.sendKeys("s");
		
		Thread.sleep(4000);
		
		List<WebElement> suggestion=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement x : suggestion) {
			
			if (x.getText().equals("Web Services")){
				
				x.click();
				
				break;
				
			}
			
		}

		
	}

}
