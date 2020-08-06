package org.selenium.com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new  ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		
		downloadLink.click();
		
		// ipo dan java venumm to inspect in windows
		
		File fileLocation=new File("C:\\Users\\Sanjay46\\Downloads");
		
		//file nu oru java class create pani path kudukirom
		
		File[] listingFiles = fileLocation.listFiles();
		
		//path la iruka files ah list pana solrom
		
		for (File x : listingFiles) {
			
			if (x.getName().equals("testleaf.xlsx")) {
				
			System.out.println("yes the file is dowwnloaded");
			
			break;
				
			}
			
		}


	}

}
