package org.selenium.com;

import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// 1.select training program using index 

		WebElement dropdownIndex= driver.findElement(By.id("dropdown1"));

		Select options = new Select(dropdownIndex);

		// --select is a class from selenium used to select the dropdown items 
		
		options.selectByIndex(1);
		
		//2.select using text
		
		options.selectByVisibleText("Appium");
		
		//3. select using value
		
		options.selectByValue("4");

		//4.get the number of dropdown options 
		
		WebElement  dropDownNum =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/select"));
		
		Select Count =new Select(dropDownNum);
		
		List <WebElement> listNumm=Count.getOptions();
		
		int n = listNumm.size();
		
		System.out.println("The number of items in dropdown is:"  +n);
		
		//5.using send keys to select
		
		dropDownNum.sendKeys("Loadrunner");
		
		//6.select multiple options in dropdown
		
		WebElement multiSelect =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select multiSelectBox =new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		
		multiSelectBox.selectByIndex(2);
		
		multiSelectBox.selectByIndex(3);
		
		multiSelectBox.selectByIndex(4);
		
	}

}
