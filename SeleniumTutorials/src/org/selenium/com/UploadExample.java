package org.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new  ChromeDriver();

		driver.get("https://gofile.io/uploadFiles");
		
		WebElement uploadButton=driver.findElement(By.id("btnChooseFiles"));
		
		uploadButton.click();
		
		// ipo windows ku poga porom , first upload file oda location ah copy panuvom clipboard ku 
		//so java content a normal format ku mathanum la so string selction use panrom
		
		StringSelection convert=new StringSelection("C:\\Users\\Sanjay46\\Downloads\\testleaf.xlsx");
		
		//this converts the location to a norma txt in clipboard 
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(convert, null);
		
		//copy ayduchu ipo paste pananumm la so robot class use panrom so acccess keyboard conrols
		
		Robot robot =new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
	//ipo realease pananum virtual keys ah 
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
