package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.schema.SelectedField;

public class CheckBoxExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
	//1. select any one check box 
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		
		checkbox.click();
		
	//2.confirm a box is selected
		
		WebElement selected=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
				
		boolean ststus=selected.isSelected();
		
		System.out.println(ststus);
		
	//3.de-select only checked 
		
		WebElement deselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if (deselect.isSelected()) {
			
			deselect.click();
			
		}
		
		WebElement select=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		if (select.isSelected()) {
			
			select.click();
			
		}
	}

}
