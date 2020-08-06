package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");
		
		//1.click a image
		
		//WebElement firstImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		//firstImage.click();
		
		//2.find wether the image is broken
		
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		//naturLWidth NU ONU USE PANUVOM 0 AH IRUNCHU NA BROKEN IMAGE
		
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println(" The image is broken");
			
		}else {
			System.out.println("image i not brken");
		}
	}
	

}
