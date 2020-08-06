package org.selenium.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");

		//1.click button to open window in new and swtich cnttrol to it 

		WebElement homePage= driver.findElement(By.id("home"));

		String currentWindow = driver.getWindowHandle();

		homePage.click();

		Set<String> newWindow = driver.getWindowHandles();

		for (String x : newWindow) {

			driver.switchTo().window(x);

		}

		WebElement editBox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));

		editBox.click();
		
		driver.close();
		
		//2.find the number of opened windows
		
		driver.switchTo().window(currentWindow);
		
		WebElement multipleWindows=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		multipleWindows.click();
		
		int size = driver.getWindowHandles().size();
		
		System.out.println("The number of windows opened r :" +size);
		
		
		
		//3.dont closr the parent window but everything else 
		
		
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement dontClose=driver.findElement(By.id("color"));
		
		dontClose.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String x : allWindows) {
			
			if (!x.equals(currentWindow)) {
				
				driver.switchTo().window(x);
				
				driver.close();
				
			}
			
		}
		
	}

}
