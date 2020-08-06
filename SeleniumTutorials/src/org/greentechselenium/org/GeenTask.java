package org.greentechselenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeenTask {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.ally.io/careers/chennai");
		
		List<WebElement> select=driver.findElements(By.xpath("//*[@class='level-0']/following-sibling::*"));
		
		Thread.sleep(4000);
		
		int size = select.size();
		
		System.out.println(size);
		
		/*for (WebElement x : select) {
			
			String text = x.getText();
			
			System.out.println(text);*/
		}
		
		
		
			
		
		}
		
		

