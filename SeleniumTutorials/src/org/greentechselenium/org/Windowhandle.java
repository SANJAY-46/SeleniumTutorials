package org.greentechselenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();

		String currentWindow = driver.getWindowHandle();

		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys("iphonex",Keys.ENTER);

		Set<String> newWindow = driver.getWindowHandles();
		
		for (String x : newWindow) {
			
			driver.switchTo().window(x);
		}
		
		WebElement iphone=driver.findElement(By.partialLinkText("Apple iPhone X (64GB, Space Gray)"));

		iphone.click();



	}

}
