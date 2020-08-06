package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/radio.html");

		//1. select a radio button

		WebElement radioButton = driver.findElement(By.id("yes"));

		radioButton.click();

		//2.find default selected radio button 

		WebElement unChecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));

		Boolean status = unChecked.isSelected();

		System.out.println(status);

		WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));

		Boolean status2 = checked.isSelected();

		System.out.println(status2);

		//3.select the age 

		WebElement below20 = driver.findElement(By.name("age"));

		below20.click();


	}



}
