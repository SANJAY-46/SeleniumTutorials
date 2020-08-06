package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		
		//1.click a button inside a frame

		driver.switchTo().frame(0);

		WebElement button1=driver.findElement(By.id("Click"));

		button1.click();

		String name = button1.getText();

		System.out.println(name);
		
		//2.click a button inside a nested frame
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement button2=driver.findElement(By.id("Click1"));
		
		button2.click();
		
		//3. find the total number of frames in thhis page
		
		driver.switchTo().defaultContent();
		
		List<WebElement> numberOfFrames = driver.findElements(By.tagName("iframe"));
		
		//by.tag name is used to identify frames
		
		int size = numberOfFrames.size();
		
		System.out.println(size);
		
		driver.quit();
		
		
	}
}
