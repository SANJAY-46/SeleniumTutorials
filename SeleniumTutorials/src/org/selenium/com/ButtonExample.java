package org.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
	   
		//find position of button xy
	    
	    WebElement position = driver.findElement(By.id("position"));
	    
	    Point pointxy = position.getLocation();
	    
	    int x = pointxy.getX();
	    
	    int y= pointxy.getY();
	    
	    System.out.println("location of x button is :" +x +  " location of button y is :"+y);
	    
	    
	    //find button colour 
	    
	    WebElement buttonColour= driver.findElement(By.id("color"));
	    
	    String color = buttonColour.getCssValue("background-color");
	    
	    System.out.println("The color of the button is: " +color);
	 
	    
	    //to find the height and width
	    
	    WebElement buttonSize = driver.findElement(By.id("size"));
	    
	    Dimension size = buttonSize.getSize();
	    
	    int height = size.height;
	    
	    int width = size.width;
	    
	    System.out.println("The height of the button is :" +height + " The width of the button is :" +width);
	    		
	    
	    //click button to go homepage
		
	    WebElement Homepage = driver.findElement(By.id("home"));
	  	Homepage.click();  
	    
	    
	    
	}
	
	
	

}
