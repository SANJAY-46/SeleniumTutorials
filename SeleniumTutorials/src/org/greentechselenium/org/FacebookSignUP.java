
package org.greentechselenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUP {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("SANJAY");
		
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("46");
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("jssanjay9346@gmail.com");
		
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("jssanjay9346@gmail.com");
		
		WebElement day=driver.findElement(By.id("day"));
		day.click();
		
		Select select=new Select(day);
		
		select.selectByValue("15");
		
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		
		Select select1=new Select(month);
		select1.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.id("year"));
		year.click();
		
		Select select2=new Select(year);
		
	    select2.selectByValue("1993");
		
	    WebElement gender=driver.findElement(By.xpath("//*[@id=\'u_0_7\']"));
	   
	    gender.click();
	   
	    WebElement signUp=driver.findElement(By.name("websubmit"));
	    signUp.click();
		
		
		
		
		
	}
	

}
