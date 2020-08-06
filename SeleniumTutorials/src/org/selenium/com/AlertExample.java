package org.selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");

		//1.click the button to display an alert box

		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));

		alertBox.click();

		Alert alert = driver.switchTo().alert();

		// abve line is to switch cintrl from chrome browser to alert so u cant press anything

		alert.accept();

		//2. click the button to display a c0nfirm box

		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

		confirmBox.click();

		Alert alert1=driver.switchTo().alert();

		//.alert is default

		alert1.dismiss();
		
		//3.to click prompt box
		
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		
		promptBox.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		//Thread.sleep(3000);
		
		alert2.sendKeys("whooohooooo");
		
		alert.accept();

		


	}

}
